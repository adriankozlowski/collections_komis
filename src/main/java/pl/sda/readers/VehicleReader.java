package pl.sda.readers;

import pl.sda.csvUtils.CsvFile;
import pl.sda.csvUtils.CsvLine;
import pl.sda.model.Vehicle;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class VehicleReader {

    public List<Vehicle> read(CsvFile file) throws IOException {
        List<Vehicle> vehicles = new LinkedList<>();
        List<CsvLine> csvLines = file.readFile();
        for (CsvLine csvLine : csvLines) {
            Vehicle vehicle = new Vehicle(csvLine);
            vehicles.add(vehicle);
        }

        return vehicles;
    }
}
