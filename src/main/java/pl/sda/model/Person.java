package pl.sda.model;

import pl.sda.csvUtils.CsvLine;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String id;
    private String name;
    private String lastName;
    private String sex;
    private String dob;
    private String pesel;
    private List<Vehicle> vehicles;

    public Person(String id, String name, String lastName, String sex, String dob, String pesel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.dob = dob;
        this.pesel = pesel;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void add(Vehicle vehicle) {
        if (vehicles == null) {
            vehicles = new ArrayList<>();
        }
        vehicles.add(vehicle);
    }

    public Person(CsvLine csvLine) {
        this.id = csvLine.get(0);
        this.name = csvLine.get(1);
        this.lastName = csvLine.get(2);
        this.sex = csvLine.get(3);
        this.dob = csvLine.get(4);
        this.pesel = csvLine.get(5);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return id + " /" + name + " " + lastName + " /" + dob + " /" + pesel;
    }
}
