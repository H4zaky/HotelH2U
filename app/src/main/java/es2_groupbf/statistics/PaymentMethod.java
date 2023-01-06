package es2_groupbf.statistics;

import es2_groupbf.entities.Client;
import es2_groupbf.entities.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentMethod {
    public static Integer getPredominantPaymentMethodPerClient(Client client) {
        Map<Integer, Integer> paymentMethodCount = new HashMap<>();

        for (Transaction transaction : client.getTransactions()) {
            Integer method = transaction.getPaymentMethod();

            if (paymentMethodCount.containsKey(method)) {
                paymentMethodCount.put(method, paymentMethodCount.get(method) + 1);
            } else {
                paymentMethodCount.put(method, 1);
            }
        }

        Integer preferredMethod = null;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : paymentMethodCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                preferredMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return preferredMethod;
    }

    public static Integer getPredominantPaymentMethodInGeneral(List<Client> clients) {
        Map<Integer, Integer> paymentMethodCount = new HashMap<>();

        for (Client client : clients) {
            for (Transaction transaction : client.getTransactions()) {
                Integer method = transaction.getPaymentMethod();

                if (paymentMethodCount.containsKey(method)) {
                    paymentMethodCount.put(method, paymentMethodCount.get(method) + 1);
                } else {
                    paymentMethodCount.put(method, 1);
                }
            }
        }

        Integer preferredMethod = null;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : paymentMethodCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                preferredMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return preferredMethod;
    }
}
