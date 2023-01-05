package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

import java.util.ArrayList;

public class MonetizationIndicator {
    public Double calculate(Iterable<Transaction> transactions) {
        double sum = 0;

        for (Transaction transaction : transactions) {
            Double lodgingRevenue = transaction.getLodgingRevenue();
            Double otherRevenue = transaction.getOtherRevenue();
            sum += (lodgingRevenue == null ? 0 : lodgingRevenue) + (otherRevenue == null ? 0 : otherRevenue);
        }

        return sum;
    }
}
