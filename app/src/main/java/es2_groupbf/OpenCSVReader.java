package es2_groupbf;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class OpenCSVReader {
    private static final File file = new File(Objects.requireNonNull(OpenCSVReader.class.getClassLoader().getResource("dataset.csv")).getFile());

    public OpenCSVReader() {
    }

    public static List<Client> parseCSV() throws IOException {
        try (CSVReader csvReader = new CSVReader(new FileReader(file.getAbsolutePath()))) {
            String[] columnMapping = {"ID", "Nationality", "Age", "DaysSinceCreation", "NameHash", "DocIDHash", "AverageLeadTime", "LodgingRevenue", "OtherRevenue", "BookingsCanceled", "BookingsCheckedIn", "PersonsNights", "RoomNights", "DaysSinceLastStay", "DaysSinceFirstStay", "DistributionChannel", "MarketSegment"};

            ColumnPositionMappingStrategy<Client> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Client.class);
            strategy.setColumnMapping(columnMapping);

            CsvToBean<Client> csvToBean = new CsvToBeanBuilder<Client>(csvReader)
                    .withMappingStrategy(strategy)
                    .withIgnoreQuotations(true)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Client> results = csvToBean.parse();

            System.out.println(results);

            return results;
        } catch (IOException exception) {
            exception.printStackTrace();
            return null;
        }
    }
}
