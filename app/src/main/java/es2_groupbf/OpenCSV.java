package es2_groupbf;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import es2_groupbf.entities.Transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCSV {
    public static List<Transaction> loadData(String filename) throws FileNotFoundException {
        List<Transaction> transactions = new ArrayList<>();

        File file = Util.getFileFromResources(filename);

        try(FileReader reader = new FileReader(file)) {
            CsvToBean<Transaction> csvToBean = new CsvToBeanBuilder<Transaction>(reader)
                    .withType(Transaction.class)
                    .withSeparator(';')
                    .build();

            for (Transaction myTransaction : csvToBean) {
                transactions.add(myTransaction);
            }
        } catch (IOException exception) {
            throw new FileNotFoundException("Error reading file: " + exception.getMessage());
        }

        return transactions;
    }
}