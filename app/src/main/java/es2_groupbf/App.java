package es2_groupbf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        try {
            transactions = OpenCSV.loadData("dataset.csv");
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        HashMap<String, List<Transaction>> clients = new HashMap<>();
        for (Transaction transaction : transactions) {
            clients.putIfAbsent(transaction.getDocIdHash(), new ArrayList<>());
            clients.get(transaction.getDocIdHash()).add(transaction);
        }

        Menu menu = new Menu();
        menu.run();
    }
}
