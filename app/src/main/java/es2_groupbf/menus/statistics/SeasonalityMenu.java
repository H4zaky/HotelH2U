package es2_groupbf.menus.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.menus.MainMenu;
import es2_groupbf.statistics.Seasonality;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SeasonalityMenu extends MainMenu {
    public SeasonalityMenu(List<Client> clients) {
        super(clients);
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|         Seasonality Menu          |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] Client Most Interesting Season");
        System.out.println("[2] Most Interesting Season Per Client");
        System.out.println("[3] Most Interesting Season In General");
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
                System.out.println("Please enter a valid option (0-3).");
                scanner.nextLine();
            }
        }

        while (option < 0 || option > 3) {
            System.out.println("Please enter a valid option (0-3).");
            System.out.println("Your option -> ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid option (0-3).");
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
                Scanner scanner = new Scanner(System.in);
                String clientID;

                System.out.println("Please enter the client ID -> ");
                clientID = scanner.nextLine().trim();

                Client client = clients.stream().filter(c -> Objects.equals(c.getDocIdHash(), clientID)).findFirst().orElse(null);

                if (Objects.isNull(client)) {
                    System.out.println("The client you provided couldn't be found!");
                    break;
                }

                String season = Seasonality.getMostInterestingSeasonPerClient(client);

                System.out.println("The most interesting season for the client with ID -> " + client.getDocIdHash() + " is -> " + season);
            }
            case 2 -> {
                for (Client client : clients) {
                    String season = Seasonality.getMostInterestingSeasonPerClient(client);
                    System.out.println("The most interesting season for the client with ID -> " + client.getDocIdHash() + " is -> " + season);
                }
            }
            case 3 -> {
                String season = Seasonality.getMostInterestingSeasonInGeneral(clients);
                System.out.println("The most interesting season in general is -> " + season);
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }

    public void run() {
        super.run();
    }
}
