package es2_groupbf;

import es2_groupbf.entities.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionTest {
    Transaction transaction;

    @BeforeEach
    public void setUp() {
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        try {
            date = dateFormat.parse("13/12/2022");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        transaction = new Transaction(1, "PRT", 18, 1024, "82a3537ff0dbce7eec35d69edc3a189ee6f17d82f353a553f9aa96cb0be3ce89", "139d544b821b13ebea14f1b0fe18577222e415c2966e3a3511c4196055232202", 15, 300.50, 150.35, 1, 15, 2, 7, 7, 1012, "Direct", "Direct", date, 3);
    }

    @Test
    @DisplayName("Getting Transaction values")
    void groupedAssertions() {
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        try {
            date = dateFormat.parse("13/12/2022");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        Date finalDate = date;

        Assertions.assertAll("Regular get value should work",
                () -> Assertions.assertEquals(1, transaction.getId()),
                () -> Assertions.assertEquals("PRT", transaction.getNationality()),
                () -> Assertions.assertEquals(18, transaction.getAge()),
                () -> Assertions.assertEquals(1024, transaction.getDaysSinceCreation()),
                () -> Assertions.assertEquals("82a3537ff0dbce7eec35d69edc3a189ee6f17d82f353a553f9aa96cb0be3ce89", transaction.getNameHash()),
                () -> Assertions.assertEquals("139d544b821b13ebea14f1b0fe18577222e415c2966e3a3511c4196055232202", transaction.getDocIdHash()),
                () -> Assertions.assertEquals(15, transaction.getAverageLeadTime()),
                () -> Assertions.assertEquals(300.50, transaction.getLodgingRevenue()),
                () -> Assertions.assertEquals(150.35, transaction.getOtherRevenue()),
                () -> Assertions.assertEquals(1, transaction.getBookingsCanceled()),
                () -> Assertions.assertEquals(15, transaction.getBookingsCheckedIn()),
                () -> Assertions.assertEquals(2, transaction.getPersonsNights()),
                () -> Assertions.assertEquals(7, transaction.getRoomNights()),
                () -> Assertions.assertEquals(7, transaction.getDaysSinceLastStay()),
                () -> Assertions.assertEquals(1012, transaction.getDaysSinceFirstStay()),
                () -> Assertions.assertEquals("Direct", transaction.getDistributionChannel()),
                () -> Assertions.assertEquals("Direct", transaction.getMarketSegment()),
                () -> Assertions.assertEquals(finalDate, transaction.getPurchaseDate()),
                () -> Assertions.assertEquals(3, transaction.getPaymentMethod())
        );
    }
}
