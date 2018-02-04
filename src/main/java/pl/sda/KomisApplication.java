package pl.sda;

import pl.sda.csvUtils.CsvFile;
import pl.sda.model.Person;
import pl.sda.model.Vehicle;
import pl.sda.readers.PeopleReader;
import pl.sda.readers.VehicleReader;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class KomisApplication {

    public List<Person> getPersonCollection() {
        try {
            return new PeopleReader()
                    .read(new CsvFile("src/main/resource/people1.csv"));
        } catch (IOException e) {
            return new LinkedList<>();
        }
    }

    public List<Vehicle> getVehiclesCollection() {
        try {
            return new VehicleReader()
                    .read(new CsvFile("src/main/resource/vehicle.csv"));
        } catch (IOException e) {
            return new LinkedList<>();
        }
    }

}
