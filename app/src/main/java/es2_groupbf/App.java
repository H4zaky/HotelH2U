package es2_groupbf;

import java.io.IOException;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        OpenCSVReader csvReader = new OpenCSVReader();

        try {
            List<Client> list = OpenCSVReader.parseCSV();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
