package es2_groupbf.converters;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class PaymentMethodConverter extends AbstractBeanField {
    @Override
    protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
        if (value.equalsIgnoreCase("NULL")) return null;
        if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 4) return null;
        return Integer.parseInt(value);
    }
}
