package es2_groupbf;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;
import es2_groupbf.segmentation.indicators.MonetizationIndicator;
import es2_groupbf.segmentation.indicators.RegularityIndicator;
import es2_groupbf.segmentation.indicators.TotalPurchasesIndicator;
import es2_groupbf.segmentation.scores.MonetizationScore;
import es2_groupbf.segmentation.scores.RegularityScore;
import es2_groupbf.segmentation.scores.TotalPurchasesScore;
import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;
import me.tongfei.progressbar.ProgressBarStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Transaction> transactionsList = new ArrayList<>();
        HashMap<String, List<Transaction>> clientsMap = new HashMap<>();
        List<Client> clientsList = new ArrayList<>();
        ProgressBar pb = new ProgressBarBuilder().setInitialMax(100).setStyle(ProgressBarStyle.ASCII).setTaskName("Loading").clearDisplayOnFinish().build();

        try {
            transactionsList = OpenCSV.loadData("dataset.csv");

            for (Transaction transaction : transactionsList) {
                clientsMap.putIfAbsent(transaction.getDocIdHash(), new ArrayList<>());
                clientsMap.get(transaction.getDocIdHash()).add(transaction);
                pb.step();
                pb.setExtraMessage("\n");
            }

            for (Map.Entry<String, List<Transaction>> entry : clientsMap.entrySet()) {
                String key = entry.getKey();
                List<Transaction> value = entry.getValue();
                clientsList.add(new Client(key, value));
            }

            for (Client client : clientsList) {
                client.setMonetization(new MonetizationIndicator().calculate(client.getTransactions()));
                client.setRegularity(new RegularityIndicator().calculate(client.getTransactions()));
                client.setTotalPurchases(new TotalPurchasesIndicator().calculate(client.getTransactions()));
            }

            new MonetizationScore().calculate(clientsList);
            new RegularityScore().calculate(clientsList);
            new TotalPurchasesScore().calculate(clientsList);

            Thread.sleep(2500);

            Menu menu = new Menu();
            menu.run();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
