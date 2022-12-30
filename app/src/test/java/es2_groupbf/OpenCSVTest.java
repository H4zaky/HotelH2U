package es2_groupbf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class OpenCSVTest {
    @Test
    @DisplayName("Reading file with string as input being valid filename")
    public void readingFileWithStringAsInputValidFileName() {
        Assertions.assertDoesNotThrow(() -> OpenCSV.loadData("dataset.csv"), "This test should return an array list of transactions contained in the csv file");
    }

    @Test
    @DisplayName("Reading file with string as input being invalid filename")
    public void readingFileWithStringAsInputInvalidFileName() {
        Assertions.assertThrows(FileNotFoundException.class, () -> OpenCSV.loadData("none.csv"), "This test should return an array list of transactions contained in the csv file");
    }
}
