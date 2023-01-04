package es2_groupbf.segmentation.scores;

import es2_groupbf.entities.Client;

import java.util.Comparator;
import java.util.List;

public class MonetizationScore {
    private List<Client> sort(List<Client> clients) {
        clients.sort(Comparator.comparing(Client::getMonetization));
        return clients;
    }

    public void calculate(List<Client> clients) {
        int q1, q2, q3, q4;

        System.out.println("Before sort!");
        System.out.println(clients);
        clients = sort(clients);
        System.out.println("After sort!");
        System.out.println(clients);

        //  size = 20
        q1 = clients.size() / 4 - 1; // 0 - 4
        q2 = clients.size() / 2 - 1; // 5 - 9
        q3 = q1 + q2 + 1; // 10 - 14
        q4 = clients.size() - 1; // 15 - 19

        for (int i = 0; i <= q1; i++) clients.get(i).setMonetizationScore(1);
        for (int i = 0; i <= q2; i++) clients.get(i).setMonetizationScore(2);
        for (int i = 0; i <= q3; i++) clients.get(i).setMonetizationScore(3);
        for (int i = 0; i <= q4; i++) clients.get(i).setMonetizationScore(4);
    }
}
