package pl.sda.model;

import java.time.LocalDate;

public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private String sex;
    private LocalDate dob;
    private String pesel;

    public Person(Integer id, String name, String lastName, String sex, LocalDate dob, String pesel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.dob = dob;
        this.pesel = pesel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
