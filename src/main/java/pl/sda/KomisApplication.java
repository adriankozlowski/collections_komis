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
                    .read(new CsvFile("src/main/resources/people1.csv"));
        } catch (IOException e) {
            return new LinkedList<>();
        }
    }

    public void format(Person person) {
        System.out.printf("%10s %10s %s %s %s", person.getId(), person.getName(), person.getLastName(), person.getDob(), person.getPesel());
    }

    public List<Vehicle> getVehiclesCollection() {
        try {
            return new VehicleReader()
                    .read(new CsvFile("src/main/resources/vehicle.csv"));
        } catch (IOException e) {
            return new LinkedList<>();
        }
    }

}
