package es2_groupbf.converters;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        if (value.equalsIgnoreCase("NULL")) return null;
        try {
            return new SimpleDateFormat("dd/MM/yy").parse(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
