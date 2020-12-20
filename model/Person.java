package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

// POJO classes
public class Person implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Person() {
        Person mike = new Person(1, "Mike", "Alexendr", 24, "Kyiv");

    }

    public Person(int id, String firstName, String lastName, int age, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    String getCity() {
        return city;
    }
}

//    public String toString() {
//        return firstName;
//    }

