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

        if ((month == 3 && day >= 21) || (month == 4) || (month == 5 && day <= 20)) return "Spring";
        if ((month == 6 && day >= 21) || (month == 7) || (month == 8 && day <= 20)) return "Summer";
        if ((month == 9 && day >= 21) || (month == 10) || (month == 11 && day <= 20)) return "Autumn";
        if ((month == 12 && day >= 21) || (month == 1) || (month == 2 && day <= 20)) return "Winter";
        return "Invalid date";
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
