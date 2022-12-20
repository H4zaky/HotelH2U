package es2_groupbf.converters;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class DoubleConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        return Float.parseFloat(value.replace(',', '.'));
    }
}
