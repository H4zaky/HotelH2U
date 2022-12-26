package es2_groupbf;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OpenCSV {
    public static List<Transaction> parseCSV() {
        List<Transaction> transactions = new ArrayList<>();

        try {
            File file = Util.getResourceFile("dataset.csv");

            if (Objects.isNull(file)) {
                throw new Exception("The application couldn't load the necessary data!");
            }

            FileReader reader = new FileReader(file);

            CsvToBean<Transaction> csvToBean = new CsvToBeanBuilder<Transaction>(reader)
                    .withType(Transaction.class)
                    .withSeparator(';')
                    .build();

            for (Transaction myTransaction : csvToBean) {
                transactions.add(myTransaction);
                System.out.println(myTransaction.toString());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }

        return transactions;
    }
}