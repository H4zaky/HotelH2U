package es2_groupbf;

import java.util.Scanner;

public class Menu {
    private int option;
    private boolean exit;

    public Menu() {
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

    private void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Welcome to the          |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    private void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("1) N/A");
        System.out.println("2) N/A");
        System.out.println("3) N/A");
        System.out.println("0) Exit");
    }

    private void readOption() {
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("Your option -> ");
        option = scanner.nextInt();

        while (option < 0 || option > 3) {
            System.out.println("Please enter a valid option.");
            System.out.println("Your option -> ");
            option = scanner.nextInt();
        }

        setOption(option);
    }

    private void performAction() {
        switch (this.option) {
            case 0:
                setExit(true);
                System.out.println("Thank you for using our application.");
                break;
            case 1:
                System.out.println("Option 1!");
                break;
            case 2:
                System.out.println("Option 2!");
                break;
            case 3:
                System.out.println("Option 3!");
                break;
            default:
                System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }

    public void run() {
        displayHeader();
        while (!exit) {
            displayOptions();
            readOption();
            performAction();
        }
    }
}