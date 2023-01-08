package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

import java.util.Date;
import java.util.Objects;

public class RegularityIndicator implements Indicator<Integer> {
    @Override
    public Integer calculateIndicator(Iterable<Transaction> transactions) {
        Date purchaseDate = null, todayDate = new Date();

        for (Transaction transaction : transactions) {
            if (Objects.isNull(purchaseDate) || transaction.getPurchaseDate().after(purchaseDate)) {
                purchaseDate = transaction.getPurchaseDate();
            }
        }

        if (Objects.isNull(purchaseDate)) return 0;

        return (int) ((todayDate.getTime() - purchaseDate.getTime()) / (1000 * 60 * 60 * 24));
    }
}
