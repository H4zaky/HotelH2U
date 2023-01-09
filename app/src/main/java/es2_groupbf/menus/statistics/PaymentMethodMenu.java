package es2_groupbf.menus.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.menus.MainMenu;
import es2_groupbf.statistics.PaymentMethod;
import es2_groupbf.statistics.Seasonality;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PaymentMethodMenu extends MainMenu {
    public PaymentMethodMenu(List<Client> clients) {
        super(clients);
    }

    @Override
    public void displayHeader() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Payment Method Menu        |");
        System.out.println("|       Hotel H2U Application       |");
        System.out.println("+-----------------------------------+");
    }

    @Override
    public void displayOptions() {
        System.out.println("Please choose one of the following options:");
        System.out.println("[1] Client Predominant Payment Method");
        System.out.println("[2] Predominant Payment Method Per Client");
        System.out.println("[3] Predominant Payment Method In General");
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

                Integer paymentMethod = PaymentMethod.getPredominantPaymentMethodPerClient(client);

                System.out.println("The most predominant payment method for the client with ID -> " + client.getDocIdHash() + " is -> " + getPaymentMethod(paymentMethod));
            }
            case 2 -> {
                for (Client client : clients) {
                    Integer paymentMethod = PaymentMethod.getPredominantPaymentMethodPerClient(client);
                    System.out.println("The most predominant payment method for the client with ID -> " + client.getDocIdHash() + " is -> " + getPaymentMethod(paymentMethod));
                }
            }
            case 3 -> {
                Integer paymentMethod = PaymentMethod.getPredominantPaymentMethodInGeneral(clients);
                System.out.println("The most predominant payment method in general is -> " + getPaymentMethod(paymentMethod));
            }
            default ->
                    System.out.println("An unknown error has occurred. Please restart Hotel H2U Application, and try again.");
        }
    }

    private String getPaymentMethod(Integer paymentMethod) {
        if (paymentMethod == 1) return "Payment Provider";
        if (paymentMethod == 2) return "Cash";
        if (paymentMethod == 3) return "Credit Card";
        if (paymentMethod == 4) return "Bank Transfer";
        return "Invalid payment method";
    }

    public void run() {
        super.run();
    }
}
