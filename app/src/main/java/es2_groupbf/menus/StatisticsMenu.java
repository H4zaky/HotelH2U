package es2_groupbf.menus;

import es2_groupbf.entities.Client;
import es2_groupbf.menus.statistics.ClientScoreMenu;
import es2_groupbf.menus.statistics.CommunicationChannelMenu;
import es2_groupbf.menus.statistics.PaymentMethodMenu;
import es2_groupbf.menus.statistics.SeasonalityMenu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StatisticsMenu extends MainMenu {
    public StatisticsMenu(List<Client> clients) {
        super(clients);
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Statistics Menu          |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] Seasonality");
        System.out.println("[2] Communication Channel");
        System.out.println("[3] Payment Method");
        System.out.println("[4] Client Score");
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
                SeasonalityMenu seasonalityMenu = new SeasonalityMenu(clients);
                seasonalityMenu.run();
            }
            case 2 -> {
                CommunicationChannelMenu communicationChannelMenu = new CommunicationChannelMenu(clients);
                communicationChannelMenu.run();
            }
            case 3 -> {
                PaymentMethodMenu paymentMethodMenu = new PaymentMethodMenu(clients);
                paymentMethodMenu.run();
            }
            case 4 -> {
                ClientScoreMenu clientScoreMenu = new ClientScoreMenu(clients);
                clientScoreMenu.run();
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }
}