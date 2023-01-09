package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

public class TotalPurchasesIndicator implements Indicator<Integer> {
    @Override
    public Integer calculateIndicator(Iterable<Transaction> transactions) {
        int total = 0;

        for (Transaction transaction : transactions) {
            total++;
        }

        return total;
    }
}
