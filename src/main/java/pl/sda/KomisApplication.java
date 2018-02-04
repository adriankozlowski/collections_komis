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
    public List<String> readPeople() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/resources/people1.csv"));
            List<String> people = new LinkedList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            bufferedReader.close();
        }
    }

    public List<String> readVehicles() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/resources/vehicle.csv"));
            List<String> vehicles = new LinkedList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                vehicles.add(line);
            }
            return vehicles;
        } catch (FileNotFoundException e) {
            throw e;
        } finally {
            bufferedReader.close();
        }
    }
}
