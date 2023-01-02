package es2_groupbf;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;
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

        try (ProgressBar pb = new ProgressBarBuilder().setInitialMax(100).setStyle(ProgressBarStyle.ASCII).setTaskName("Loading").build()) {
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

            Thread.sleep(2500);

            Menu menu = new Menu();
            menu.run();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
