package pl.sda;

import pl.sda.model.Person;
import pl.sda.model.ValidPerson;
import pl.sda.model.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {

    public static void main(String[] args) {
//        unZipResources();
        KomisApplication komisApplication = new KomisApplication();
        List<Person> people = komisApplication.getPersonCollection();
        List<Vehicle> vehiclesCollection = komisApplication.getVehiclesCollection();


        System.out.println();
    }

    private static void mapVehicleToPerson(List<Person> people, List<Vehicle> vehiclesCollection) {
        Map<String, List<Vehicle>> collect = vehiclesCollection.stream()
                .collect(Collectors.groupingBy(Vehicle::getId));

        people.stream().forEach(person -> {
            person.setVehicles(collect.get(person.getId()));
        });
    }

    private static void mappingToOtherObject(KomisApplication komisApplication, List<Person> people) {
        List<ValidPerson> collect = people.stream()
                .filter(komisApplication::validatePerson)
                .map(person -> new ValidPerson(person.getName(), person.getLastName(), person.getPesel()))
                .collect(Collectors.toList());
    }

    private static void nameGrouping(List<Person> people) {
        Map<String, List<Person>> collect = people.stream().collect(Collectors.groupingBy(Person::getName));
        collect.keySet().stream().forEach(s -> {
            System.out.println(s + " - " + collect.get(s).size());
        });
    }

    private static void sexGrouping(KomisApplication komisApplication, List<Person> people) {
        Map<String, List<Person>> collect = people.stream()
                .filter(person -> komisApplication.validatePerson(person))
                .collect(Collectors.groupingBy(Person::getSex));

        System.out.println("Mamy " + collect.get("F").size() + " kobiet");
        System.out.println("Mamy " + collect.get("M").size() + " meżczyzn");
    }


    /**
     * Unzip it
     *
     */
    public static void unZipResources() {
        System.out.println("Rozpakowywanie! Nie wyłączaj programu...");
        byte[] buffer = new byte[1024];
        try {
            String zipFilePath = "src/main/resources/vehicle.zip";
            if (Files.exists(Paths.get(zipFilePath))) {
                File folder = new File("src/main/resources/");
                ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
                ZipEntry ze = zis.getNextEntry();
                while (ze != null) {
                    String fileName = ze.getName();
                    File newFile = new File(folder + File.separator + fileName);
                    System.out.println(" : " + newFile.getAbsoluteFile());
                    new File(newFile.getParent()).mkdirs();
                    FileOutputStream fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();
                    ze = zis.getNextEntry();
                }
                zis.closeEntry();
                zis.close();
                System.out.println("Gotowe");
            } else {
                System.out.println("Wygląda na to, że wszystko jest rozpakowane!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
