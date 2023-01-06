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
