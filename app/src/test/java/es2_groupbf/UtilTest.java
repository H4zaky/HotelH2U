package es2_groupbf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class UtilTest {
    @Test
    @DisplayName("Getting file from resources with string as input being valid filename")
    public void gettingFileWithStringAsInputValidFileName() {
        Assertions.assertDoesNotThrow(() -> Util.getFileFromResources("dataset.csv"), "This test should return a file located in the resources folder");
    }

    @Test
    @DisplayName("Getting file from resources with string as input being invalid filename")
    public void gettingFileWithStringAsInputInvalidFileName() {
        Assertions.assertThrows(FileNotFoundException.class, () -> Util.getFileFromResources("none.csv"), "This test should return a file located in the resources folder");
    }
}
