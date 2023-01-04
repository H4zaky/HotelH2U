package es2_groupbf.segmentation.indicators;

import es2_groupbf.Util;
import es2_groupbf.entities.Transaction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class RegularityIndicator {
    public Integer calculate(Iterable<Transaction> transactions) throws ParseException {
        Date purchaseDate = transactions.iterator().next().getPurchaseDate(), todayDate = new Date();

        for (Transaction transaction : transactions) {
            if (transaction.getPurchaseDate().after(purchaseDate)) {
                purchaseDate = transaction.getPurchaseDate();
            } else if (transaction.getPurchaseDate().equals(purchaseDate)) {
                purchaseDate = transaction.getPurchaseDate();
            }
        }

        if (Objects.isNull(purchaseDate)) return 0;

        return (int) ((todayDate.getTime() - purchaseDate.getTime()) / (1000 * 60 * 60 * 24));
    }
}
