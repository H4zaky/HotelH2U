package es2_groupbf;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Transaction> transactions = OpenCSV.parseCSV();
        Menu menu = new Menu();
        menu.run();
    }
}
