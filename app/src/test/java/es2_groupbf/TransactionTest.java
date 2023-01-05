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
            date = dateFormat.parse("23/05/18");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        Date finalDate = date;

        transaction = new Transaction();
        transaction.setId(1);
        transaction.setNationality("PRT");
        transaction.setAge(51);
        transaction.setDaysSinceCreation(150);
        transaction.setNameHash("0x8E0A7AF39B633D5EA25C3B7EF4DFC5464B36DB7AF375716EB065E29697CC071E");
        transaction.setDocIdHash("0x71568459B729F7A7ABBED6C781A84CA4274D571003ACC7A4A791C3350D924137");
        transaction.setAverageLeadTime(45);
        transaction.setLodgingRevenue(371.0);
        transaction.setOtherRevenue(105.3);
        transaction.setBookingsCanceled(1);
        transaction.setBookingsCheckedIn(3);
        transaction.setPersonsNights(8);
        transaction.setRoomNights(5);
        transaction.setDaysSinceLastStay(151);
        transaction.setDaysSinceFirstStay(1074);
        transaction.setDistributionChannel("Corporate");
        transaction.setMarketSegment("Corporate");
        transaction.setPurchaseDate(finalDate);
        transaction.setPaymentMethod(1);
    }

    @Test
    @DisplayName("Test getters and setters")
    void testGettersSetters() {
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        try {
            date = dateFormat.parse("23/05/18");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        Date finalDate = date;

        transaction.setId(1);
        transaction.setNationality("PRT");
        transaction.setAge(51);
        transaction.setDaysSinceCreation(150);
        transaction.setNameHash("0x8E0A7AF39B633D5EA25C3B7EF4DFC5464B36DB7AF375716EB065E29697CC071E");
        transaction.setDocIdHash("0x71568459B729F7A7ABBED6C781A84CA4274D571003ACC7A4A791C3350D924137");
        transaction.setAverageLeadTime(45);
        transaction.setLodgingRevenue(371.0);
        transaction.setOtherRevenue(105.3);
        transaction.setBookingsCanceled(1);
        transaction.setBookingsCheckedIn(3);
        transaction.setPersonsNights(8);
        transaction.setRoomNights(5);
        transaction.setDaysSinceLastStay(151);
        transaction.setDaysSinceFirstStay(1074);
        transaction.setDistributionChannel("Corporate");
        transaction.setMarketSegment("Corporate");
        transaction.setPurchaseDate(finalDate);
        transaction.setPaymentMethod(1);

        Assertions.assertAll(
                () -> Assertions.assertEquals(1, transaction.getId()),
                () -> Assertions.assertEquals("PRT", transaction.getNationality()),
                () -> Assertions.assertEquals(51, transaction.getAge()),
                () -> Assertions.assertEquals(150, transaction.getDaysSinceCreation()),
                () -> Assertions.assertEquals("0x8E0A7AF39B633D5EA25C3B7EF4DFC5464B36DB7AF375716EB065E29697CC071E", transaction.getNameHash()),
                () -> Assertions.assertEquals("0x71568459B729F7A7ABBED6C781A84CA4274D571003ACC7A4A791C3350D924137", transaction.getDocIdHash()),
                () -> Assertions.assertEquals(45, transaction.getAverageLeadTime()),
                () -> Assertions.assertEquals(371.0, transaction.getLodgingRevenue()),
                () -> Assertions.assertEquals(105.3, transaction.getOtherRevenue()),
                () -> Assertions.assertEquals(1, transaction.getBookingsCanceled()),
                () -> Assertions.assertEquals(3, transaction.getBookingsCheckedIn()),
                () -> Assertions.assertEquals(8, transaction.getPersonsNights()),
                () -> Assertions.assertEquals(5, transaction.getRoomNights()),
                () -> Assertions.assertEquals(151, transaction.getDaysSinceLastStay()),
                () -> Assertions.assertEquals(1074, transaction.getDaysSinceFirstStay()),
                () -> Assertions.assertEquals("Corporate", transaction.getDistributionChannel()),
                () -> Assertions.assertEquals("Corporate", transaction.getMarketSegment()),
                () -> Assertions.assertEquals(finalDate, transaction.getPurchaseDate()),
                () -> Assertions.assertEquals(1, transaction.getPaymentMethod())
        );
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        String expected = "Transaction{id=1, nationality='PRT', age=51, daysSinceCreation=150, nameHash='0x8E0A7AF39B633D5EA25C3B7EF4DFC5464B36DB7AF375716EB065E29697CC071E', docIdHash='0x71568459B729F7A7ABBED6C781A84CA4274D571003ACC7A4A791C3350D924137', averageLeadTime=45, lodgingRevenue=371.0, otherRevenue=105.3, bookingsCanceled=1, bookingsCheckedIn=3, personsNights=8, roomNights=5, daysSinceLastStay=151, daysSinceFirstStay=1074, distributionChannel='Corporate', marketSegment='Corporate', purchaseDate=Wed May 23 00:00:00 WEST 2018, paymentMethod=1}";
        Assertions.assertEquals(expected, transaction.toString());
    }

    @Test
    @DisplayName("Test equals method")
    void testEquals() {
        Transaction transaction1 = transaction;
        Transaction transaction2 = transaction;
        Transaction transaction3 = null;

        Assertions.assertTrue(transaction1.equals(transaction2));
        Assertions.assertFalse(transaction1.equals(transaction3));
    }
}
