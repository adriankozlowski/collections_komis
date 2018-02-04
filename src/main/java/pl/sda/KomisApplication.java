package pl.sda;

import pl.sda.csvUtils.CsvFile;
import pl.sda.model.Person;
import pl.sda.readers.PeopleReader;

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

}
