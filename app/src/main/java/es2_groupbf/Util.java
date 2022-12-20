package es2_groupbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Util {
    public static File getResourceFile(String filename) {
        try {
            URL filePath = Util.class.getClassLoader().getResource(filename);

            if (Objects.isNull(filePath)) {
                throw new FileNotFoundException();
            }

            String fileAbsolutePath = filePath.getFile();

            File file = new File(fileAbsolutePath);

            return file;
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}