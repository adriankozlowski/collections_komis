package pl.sda;

import pl.sda.model.Person;
import pl.sda.model.Vehicle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {

    public static void main(String[] args) {
//        unZipResources();
        KomisApplication komisApplication = new KomisApplication();
        List<Person> people = komisApplication.getPersonCollection();
        List<Vehicle> vehiclesCollection = komisApplication.getVehiclesCollection();


        people.stream().forEach(System.out::println);


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
