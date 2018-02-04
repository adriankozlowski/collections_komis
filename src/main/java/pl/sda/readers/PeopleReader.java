package pl.sda.readers;

import pl.sda.csvUtils.CsvFile;
import pl.sda.csvUtils.CsvLine;
import pl.sda.model.Person;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PeopleReader {
    public List<Person> read(CsvFile file) throws IOException {
        List<Person> people = new LinkedList<>();
        List<CsvLine> csvLines = file.readFile();
        for (CsvLine csvLine : csvLines) {
            Person person = new Person(csvLine);
            people.add(person);
        }

        return people;
    }
}
