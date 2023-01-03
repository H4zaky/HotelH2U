package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class RegularityIndicator {
    public Integer calculate(Iterable<Transaction> transactions) {
        Date purchaseDate = null, todayDate = null;

        try {
            todayDate = new SimpleDateFormat("dd/MM/yy").parse(String.valueOf(new Date()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        for (Transaction transaction : transactions) {
            if (transaction.getPurchaseDate().after(purchaseDate)) {
                purchaseDate = transaction.getPurchaseDate();
            }
        }

        if (Objects.isNull(todayDate) || Objects.isNull(purchaseDate)) return null;

        return (int) ((todayDate.getTime() - purchaseDate.getTime()) / (1000 * 60 * 60 * 24));
    }
}
