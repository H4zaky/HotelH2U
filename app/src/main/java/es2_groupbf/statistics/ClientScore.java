package es2_groupbf.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientScore {
    public static Map<String, Client> getClientWithMaximumOfEachScore(List<Client> clients) {
        Map<String, Client> maximumOfEachScore = new HashMap<>();

        Client bestClientOfMonetizationScore = null;
        int maxMonetizationScore = Integer.MIN_VALUE;
        for (Client c : clients) {
            if (c.getMonetizationScore() > maxMonetizationScore) {
                bestClientOfMonetizationScore = c;
                maxMonetizationScore = c.getMonetizationScore();
            }
        }
        maximumOfEachScore.put("monetizationScore", bestClientOfMonetizationScore);

        Client bestClientOfRegularityScore = null;
        int maxRegularityScore = Integer.MIN_VALUE;
        for (Client c : clients) {
            if (c.getRegularityScore() > maxRegularityScore) {
                bestClientOfRegularityScore = c;
                maxRegularityScore = c.getRegularityScore();
            }
        }
        maximumOfEachScore.put("regularityScore", bestClientOfRegularityScore);

        Client bestClientOfTotalPurchasesScore = null;
        int maxTotalPurchasesScore = Integer.MIN_VALUE;
        for (Client c : clients) {
            if (c.getTotalPurchasesScore() > maxTotalPurchasesScore) {
                bestClientOfTotalPurchasesScore = c;
                maxTotalPurchasesScore = c.getTotalPurchasesScore();
            }
        }
        maximumOfEachScore.put("totalPurchasesScore", bestClientOfTotalPurchasesScore);

        return maximumOfEachScore;
    }

    public static Map<String, Client> getClientWithMinimumOfEachScore(List<Client> clients) {
        Map<String, Client> minimumOfEachScore = new HashMap<>();

        Client worstClientOfMonetizationScore = null;
        int minMonetizationScore = Integer.MAX_VALUE;
        for (Client client : clients) {
            if (client.getMonetizationScore() < minMonetizationScore) {
                worstClientOfMonetizationScore = client;
                minMonetizationScore = client.getMonetizationScore();
            }
        }
        minimumOfEachScore.put("monetizationScore", worstClientOfMonetizationScore);

        Client worstClientOfRegularityScore = null;
        int minRegularityScore = Integer.MAX_VALUE;
        for (Client client : clients) {
            if (client.getRegularityScore() < minRegularityScore) {
                worstClientOfRegularityScore = client;
                minRegularityScore = client.getRegularityScore();
            }
        }
        minimumOfEachScore.put("regularityScore", worstClientOfRegularityScore);

        Client worstClientOfTotalPurchasesScore = null;
        int minTotalPurchasesScore = Integer.MAX_VALUE;
        for (Client client : clients) {
            if (client.getTotalPurchasesScore() < minTotalPurchasesScore) {
                worstClientOfTotalPurchasesScore = client;
                minTotalPurchasesScore = client.getTotalPurchasesScore();
            }
        }
        minimumOfEachScore.put("totalPurchasesScore", worstClientOfTotalPurchasesScore);

        return minimumOfEachScore;
    }

    public static Client getClientWithBestAverageScore(List<Client> clients) {
        return clients.stream().reduce((client1, client2) -> {
            int averageScore1 = (client1.getMonetizationScore() + client1.getRegularityScore() + client1.getTotalPurchasesScore()) / 3;
            int averageScore2 = (client2.getMonetizationScore() + client2.getRegularityScore() + client2.getTotalPurchasesScore()) / 3;
            return averageScore1 > averageScore2 ? client1 : client2;
        }).orElse(null);
    }

    public static Client getClientWithWorstAverageScore(List<Client> clients) {
        return clients.stream().reduce((client1, client2) -> {
            int averageScore1 = (client1.getMonetizationScore() + client1.getRegularityScore() + client1.getTotalPurchasesScore()) / 3;
            int averageScore2 = (client2.getMonetizationScore() + client2.getRegularityScore() + client2.getTotalPurchasesScore()) / 3;
            return averageScore1 < averageScore2 ? client1 : client2;
        }).orElse(null);
    }
}
