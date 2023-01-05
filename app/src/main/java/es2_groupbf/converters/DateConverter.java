package es2_groupbf.converters;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import es2_groupbf.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        if (value.equalsIgnoreCase("NULL")) return null;
        try {
            return Util.formatDate(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
