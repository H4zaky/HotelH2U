package es2_groupbf;

import es2_groupbf.entities.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OpenCSVTest {
    private static final String TEST_FILE_NAME = "dataset.csv";
    private static final String TEST_EMPTY_FILE_NAME = "empty.csv";
    private static final String NON_EXISTENT_FILE_NAME = "invalid_filename.csv";

    @Test
    @DisplayName("Test loadData method with valid file")
    void testLoadData() throws Exception {
        Date date = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        List<Transaction> transactions = OpenCSV.loadData("dataset.csv");
        Transaction transaction = transactions.get(0);

        try {
            date = dateFormat.parse("23/05/18");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

        Date finalDate = date;

        Assertions.assertAll(
                () -> Assertions.assertEquals(83590, transactions.size()),
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
    @DisplayName("Test loadData method with valid file")
    void testLoadData_ValidFile() {
        Assertions.assertDoesNotThrow(() -> OpenCSV.loadData(TEST_FILE_NAME));
    }

    @Test
    @DisplayName("Test loadData method with file not found")
    void testLoadData_FileNotFound() {
        Assertions.assertThrows(FileNotFoundException.class, () -> OpenCSV.loadData(NON_EXISTENT_FILE_NAME));
    }

    @Test
    @DisplayName("Test loadData method with empty file")
    void testLoadData_EmptyFile() throws Exception {
        List<Transaction> transactions = OpenCSV.loadData(TEST_EMPTY_FILE_NAME);
        Assertions.assertEquals(0, transactions.size());
    }
}
