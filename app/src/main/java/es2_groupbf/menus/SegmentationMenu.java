package es2_groupbf.menus;

import es2_groupbf.entities.Client;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SegmentationMenu extends MainMenu {
    public SegmentationMenu(List<Client> clients) {
        super(clients);
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|         Segmentation Menu         |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] ");
        System.out.println("[2] ");
        System.out.println("[3] ");
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
                System.out.println("Option 1!");
            }
            case 2 -> {
                System.out.println("Option 2!");
            }
            case 3 -> {
                System.out.println("Option 3!");
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }
}