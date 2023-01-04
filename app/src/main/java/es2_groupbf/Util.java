package es2_groupbf;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Util {
    private static URL getFilePathFromResources(String fileName) {
        return Util.class.getClassLoader().getResource(fileName);
    }

    private static String getAbsoluteFilePathFromResources(String fileName) throws FileNotFoundException {
        URL filePath = getFilePathFromResources(fileName);

        if (Objects.isNull(filePath)) {
            throw new FileNotFoundException("The following file was not found -> " + fileName);
        }

        return filePath.getPath();
    }

    public static File getFileFromResources(String fileName) throws FileNotFoundException {
        String absoluteFilePath = getAbsoluteFilePathFromResources(fileName);

        if (Objects.isNull(absoluteFilePath)) {
            throw new FileNotFoundException("The following file was not found -> " + fileName);
        }

        return new File(absoluteFilePath);
    }

    public static Date formatDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yy").parse((date));
    }
}