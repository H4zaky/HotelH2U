package es2_groupbf.segmentation.scores;

import es2_groupbf.entities.Client;

import java.util.Comparator;
import java.util.List;

public class RegularityScore {
    private List<Client> sort(List<Client> clients) {
        clients.sort(Comparator.comparing(Client::getRegularity));
        return clients;
    }

    public void calculate(List<Client> clients) {
        clients = sort(clients);

        int numberClients = clients.size();
        int q1 = numberClients / 4 - 1;
        int q2 = numberClients / 2 - 1;
        int q3 = q1 + q2 + 1;
        int q4 = numberClients - 1;

        for (int i = 0; i <= q1; i++) clients.get(i).setRegularityScore(1);
        for (int i = 0; i <= q2; i++) clients.get(i).setRegularityScore(2);
        for (int i = 0; i <= q3; i++) clients.get(i).setRegularityScore(3);
        for (int i = 0; i <= q4; i++) clients.get(i).setRegularityScore(4);
    }
}
