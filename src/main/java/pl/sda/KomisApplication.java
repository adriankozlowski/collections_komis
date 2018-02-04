package pl.sda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class KomisApplication {

    /**
     * MEtoda odczytuje osoby z pliku do kolekcji stringów
     *
     * @return
     */
    public List<String> readFile(String filePath) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            List<String> list = new LinkedList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            return list;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            bufferedReader.close();
        }
    }
}
