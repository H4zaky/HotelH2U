package es2_groupbf.menus.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.menus.MainMenu;
import es2_groupbf.statistics.ClientScore;
import es2_groupbf.statistics.CommunicationChannel;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClientScoreMenu extends MainMenu {
    public ClientScoreMenu(List<Client> clients) {
        super(clients);
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|         Client Score Menu         |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] Client With Maximum Of Each Score");
        System.out.println("[2] Client With Minimum Of Each Score");
        System.out.println("[3] Client With Best Average Score");
        System.out.println("[4] Client With Worst Average Score");
        System.out.println("[0] Back");
    }

    @Override
    public void readOption() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (true) {
            try {
                System.out.println("Your option -> ");
                option = scanner.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Please enter a valid option (0-4).");
                scanner.nextLine();
            }
        }

        while (option < 0 || option > 4) {
            System.out.println("Please enter a valid option (0-4).");
            System.out.println("Your option -> ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid option (0-4).");
                System.out.println("Your option -> ");
                scanner.next();
            }
            option = scanner.nextInt();
        }

        setOption(option);
    }

    @Override
    public void handleOption() {
        switch (getOption()) {
            case 0 -> setExit(true);
            case 1 -> {
                Map<String, Client> clientMap = ClientScore.getClientWithMaximumOfEachScore(clients);
                System.out.println("The client with maximum monetization score is -> " + clientMap.get("monetizationScore").getDocIdHash());
                System.out.println("The client with maximum regularity score is -> " + clientMap.get("regularityScore").getDocIdHash());
                System.out.println("The client with maximum total purchases score is -> " + clientMap.get("totalPurchasesScore").getDocIdHash());
            }
            case 2 -> {
                Map<String, Client> clientMap = ClientScore.getClientWithMinimumOfEachScore(clients);
                System.out.println("The client with minimum monetization score is -> " + clientMap.get("monetizationScore").getDocIdHash());
                System.out.println("The client with minimum regularity score is -> " + clientMap.get("regularityScore").getDocIdHash());
                System.out.println("The client with minimum total purchases score is -> " + clientMap.get("totalPurchasesScore").getDocIdHash());
            }
            case 3 -> {
                Client client = ClientScore.getClientWithBestAverageScore(clients);
                System.out.println("The client with best average score is -> " + client.getDocIdHash());
            }
            case 4 -> {
                Client client = ClientScore.getClientWithWorstAverageScore(clients);
                System.out.println("The client with worst average score is -> " + client.getDocIdHash());
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }

    @Override
    public void run() {
        super.run();
    }
}
