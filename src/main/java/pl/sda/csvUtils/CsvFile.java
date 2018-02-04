package pl.sda.csvUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CsvFile {

    private final String filePath;
    private Collection<CsvLine> lines;

    public CsvFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * MEtoda odczytuje
     * osoby z
     * pliku do
     * kolekcji stringów
     *
     * @return
     */

    public List<CsvLine> readFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            CsvFile csvFile = new CsvFile(filePath);
            bufferedReader = new BufferedReader(new FileReader(filePath));
            List<CsvLine> list = new LinkedList<CsvLine>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(new CsvLine(line));
            }
            return list;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            bufferedReader.close();
        }
    }
}
