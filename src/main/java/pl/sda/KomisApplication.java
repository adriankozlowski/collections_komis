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
        System.out.printf("%10s %10s %20s %11s %16s \n", person.getId(), person.getName(), person.getLastName(), person.getDob(), person.getPesel());
    }

    public List<Vehicle> getVehiclesCollection() {
        try {
            return new VehicleReader()
                    .read(new CsvFile("src/main/resources/vehicle.csv"));
        } catch (IOException e) {
            return new LinkedList<>();
        }
    }

    public boolean validatePerson(Person person) {
        if (person.getName().isEmpty())
            return false;
        if (person.getLastName().isEmpty())
            return false;
        if (!(person.getName().endsWith("a") && person.getSex().equals("F"))) {
            return false;
        }
        if (!validatePesel(person.getPesel(), person.getDob())) {
            return false;
        }
        return true;
    }

    private boolean validatePesel(String pesel, String dob) {
        return true;
    }
}
