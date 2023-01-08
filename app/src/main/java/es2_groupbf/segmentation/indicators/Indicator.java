package es2_groupbf.segmentation.indicators;

import es2_groupbf.entities.Transaction;

public interface Indicator<T> {
    T calculateIndicator(Iterable<Transaction> transactions);
}
