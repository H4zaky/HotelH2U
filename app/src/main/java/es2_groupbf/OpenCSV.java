package es2_groupbf;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class OpenCSV {

    public static List<Transaction> parseCSV() {
        try {
            File file = Util.getResourceFile("dataset-v2.csv");

            if (Objects.isNull(file)) {
                throw new Exception("The application couldn't load the necessary data!");
            }

            CSVReader csvReader = new CSVReader(new FileReader(file));

            String[] columnMapping = {"ID", "Nationality", "Age", "DaysSinceCreation", "NameHash", "DocIDHash", "AverageLeadTime", "LodgingRevenue", "OtherRevenue", "BookingsCanceled", "BookingsCheckedIn", "PersonsNights", "RoomNights", "DaysSinceLastStay", "DaysSinceFirstStay", "DistributionChannel", "MarketSegment", "PurchaseDate", "PaymentMethod"};
            List<Transaction> transactions = new ArrayList<>();

            ColumnPositionMappingStrategy<Transaction> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Transaction.class);
            strategy.setColumnMapping(columnMapping);

            CsvToBean<Transaction> csvToBean = new CsvToBeanBuilder<Transaction>(csvReader)
                    .withMappingStrategy(strategy)
                    .withSeparator(';')
                    .build();

            Iterator<Transaction> myTransactionIterator = csvToBean.iterator();

            while (myTransactionIterator.hasNext()) {
                Transaction myTransaction = myTransactionIterator.next();
                System.out.println(myTransaction);
            }

            csvReader.close();

            return transactions;
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
