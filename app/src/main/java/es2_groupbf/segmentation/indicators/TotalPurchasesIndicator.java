package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

import java.util.ArrayList;

public class TotalPurchasesIndicator {
    public Integer calculate(Iterable<Transaction> transactions) {
        int total = 0;

        for (Transaction transaction : transactions) {
            total++;
        }

        return total;
    }
}
