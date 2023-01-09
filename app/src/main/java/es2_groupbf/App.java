package es2_groupbf;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;
import es2_groupbf.menus.MainMenu;
import es2_groupbf.segmentation.indicators.MonetizationIndicator;
import es2_groupbf.segmentation.indicators.RegularityIndicator;
import es2_groupbf.segmentation.indicators.TotalPurchasesIndicator;
import es2_groupbf.segmentation.scores.MonetizationScore;
import es2_groupbf.segmentation.scores.RegularityScore;
import es2_groupbf.segmentation.scores.TotalPurchasesScore;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        try {
            List<Transaction> transactions = loadTransactionsFromCSV();

            List<Client> clients = createClientsFromTransactions(transactions);

            setIndicatorsForClients(clients);

            calculateScores(clients);

            MainMenu menu = new MainMenu(clients);
            menu.run();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static List<Transaction> loadTransactionsFromCSV() throws FileNotFoundException {
        return OpenCSV.loadData("dataset.csv");
    }

    private static List<Client> createClientsFromTransactions(List<Transaction> transactions) {
        HashMap<String, List<Transaction>> clientsMap = new HashMap<>();
        List<Client> clients = new ArrayList<>();

        for (Transaction transaction : transactions) {
            clientsMap.putIfAbsent(transaction.getDocIdHash(), new ArrayList<>());
            clientsMap.get(transaction.getDocIdHash()).add(transaction);
        }

        for (Map.Entry<String, List<Transaction>> entry : clientsMap.entrySet()) {
            String key = entry.getKey();
            List<Transaction> value = entry.getValue();
            clients.add(new Client(key, value));
        }

        return clients;
    }

    private static void setIndicatorsForClients(List<Client> clients) throws ParseException {
        for (Client client : clients) {
            client.setMonetization(new MonetizationIndicator().calculateIndicator(client.getTransactions()));
            client.setRegularity(new RegularityIndicator().calculateIndicator(client.getTransactions()));
            client.setTotalPurchases(new TotalPurchasesIndicator().calculateIndicator(client.getTransactions()));
        }
    }

    private static void calculateScores(List<Client> clients) {
        new MonetizationScore().calculateScore(clients);
        new RegularityScore().calculateScore(clients);
        new TotalPurchasesScore().calculateScore(clients);
    }
}
