package es2_groupbf.menus;

import es2_groupbf.entities.Client;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainMenu implements Menu {
    private int option;
    private boolean exit;
    protected List<Client> clients;

    public MainMenu() {
    }

    public MainMenu(List<Client> clients) {
        this.clients = clients;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|             Main Menu             |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] Segmentation");
        System.out.println("[2] Statistics");
        System.out.println("[0] Exit");
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
                System.out.println("Please enter a valid option (0-2).");
                scanner.nextLine();
            }
        }

        while (option < 0 || option > 2) {
            System.out.println("Please enter a valid option (0-2).");
            System.out.println("Your option -> ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid option (0-2).");
                System.out.println("Your option -> ");
                scanner.next();
            }
            option = scanner.nextInt();
        }

        setOption(option);
    }

    @Override
    public void handleOption() {
        switch (this.option) {
            case 0 -> {
                setExit(true);
                System.out.println("Thank you for using our application.");
            }
            case 1 -> {
                SegmentationMenu segmentationMenu = new SegmentationMenu(clients);
                segmentationMenu.run();
            }
            case 2 -> {
                StatisticsMenu statisticsMenu = new StatisticsMenu(clients);
                statisticsMenu.run();
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }

    @Override
    public void run() {
        while (!exit) {
            displayHeader();
            displayOptions();
            readOption();
            handleOption();
        }
    }
}
