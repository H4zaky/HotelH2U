package es2_groupbf.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Seasonality {
    private static String getSeason(LocalDate date) {
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        return switch (month) {
            case 3 -> day >= 21 ? "Spring" : "Winter";
            case 4, 5 -> "Spring";
            case 6 -> day >= 21 ? "Summer" : "Spring";
            case 7, 8 -> "Summer";
            case 9 -> day >= 21 ? "Autumn" : "Summer";
            case 10, 11 -> "Autumn";
            case 12 -> day >= 21 ? "Winter" : "Autumn";
            case 1, 2 -> "Winter";
            default -> "Invalid date";
        };
    }

    public static String getMostInterestingSeasonPerClient(Client client) {
        Map<String, Integer> seasonCount = new HashMap<>();

        for (Transaction transaction : client.getTransactions()) {
            LocalDate date = transaction.getDate();
            String season = getSeason(date);

            if (seasonCount.containsKey(season)) {
                seasonCount.put(season, seasonCount.get(season) + 1);
            } else {
                seasonCount.put(season, 1);
            }
        }

        String mostInterestingSeason = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : seasonCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostInterestingSeason = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostInterestingSeason;
    }

    public static String getMostInterestingSeasonInGeneral(List<Client> clients) {
        Map<String, Integer> seasonCount = new HashMap<>();

        for (Client client : clients) {
            for (Transaction transaction : client.getTransactions()) {
                LocalDate date = transaction.getDate();
                String season = getSeason(date);

                if (seasonCount.containsKey(season)) {
                    seasonCount.put(season, seasonCount.get(season) + 1);
                } else {
                    seasonCount.put(season, 1);
                }
            }
        }

        String mostInterestingSeason = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : seasonCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostInterestingSeason = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostInterestingSeason;
    }
}
