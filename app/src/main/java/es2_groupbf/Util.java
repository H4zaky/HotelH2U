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
    private static URL getFileURLFromResources(String fileName) {
        return Util.class.getClassLoader().getResource(fileName);
    }

    private static String getAbsoluteFilePathFromURL(URL fileURL) throws FileNotFoundException {
        if (Objects.isNull(fileURL)) {
            throw new FileNotFoundException("File not found!");
        }

        return fileURL.getPath();
    }

    public static File getFileFromResources(String fileName) throws FileNotFoundException {
        URL fileURL = getFileURLFromResources(fileName);
        String absoluteFilePath = getAbsoluteFilePathFromURL(fileURL);

        if (Objects.isNull(absoluteFilePath)) {
            throw new FileNotFoundException("The following file was not found -> " + fileName);
        }

        return new File(absoluteFilePath);
    }

    public static Date formatDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yy").parse((date));
    }
}