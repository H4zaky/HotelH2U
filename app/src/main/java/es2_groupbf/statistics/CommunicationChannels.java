package es2_groupbf.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommunicationChannels {
    public static String getMostUsedCommunicationChannel(List<Client> clients) {
        Map<String, Integer> channelCount = new HashMap<>();

        for (Client client : clients) {
            for (Transaction transaction : client.getTransactions()) {
                String channel = transaction.getDistributionChannel();

                if (channelCount.containsKey(channel)) {
                    channelCount.put(channel, channelCount.get(channel) + 1);
                } else {
                    channelCount.put(channel, 1);
                }
            }
        }

        String mostUsedChannel = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : channelCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostUsedChannel = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostUsedChannel;
    }
}
