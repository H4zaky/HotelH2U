package es2_groupbf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilTest {
    private static final String TEST_FILE_NAME = "dataset.csv";
    private static final String NON_EXISTENT_FILE_NAME = "invalid_filename.csv";
    private static final String DATE_STRING = "01/01/23";
    private static Date DATE;

    @BeforeEach
    public void setUp() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

        try {
            DATE = dateFormat.parse("01/01/23");
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test getFileFromResources method with existing file")
    void testGetFileFromResources() throws FileNotFoundException {
        File file = Util.getFileFromResources(TEST_FILE_NAME);
        Assertions.assertNotNull(file);
        Assertions.assertTrue(file.exists());
        Assertions.assertEquals(TEST_FILE_NAME, file.getName());
    }

    @Test
    @DisplayName("Test getFileFromResources method with non-existent file")
    void testGetFileFromResources_nonExistentFile() {
        Assertions.assertThrows(FileNotFoundException.class, () -> Util.getFileFromResources(NON_EXISTENT_FILE_NAME));
    }

    @Test
    @DisplayName("Test formatDate method")
    void testFormatDate() throws ParseException {
        Date formattedDate = Util.formatDate(DATE_STRING);
        Assertions.assertNotNull(formattedDate);
        Assertions.assertEquals(DATE, formattedDate);
    }
}
