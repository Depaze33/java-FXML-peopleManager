package fr.afpa;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty city;

    // Constructeur de la classe
    public Person(String firstName, String lastName, String city) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.city = new SimpleStringProperty(city);
    }

    // Getter pour firstName
    public String getFirstName() {
        return firstName.get();
    }

    // Setter pour firstName
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    // Getter pour lastName
    public String getLastName() {
        return lastName.get();
    }

    // Setter pour lastName
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    // Getter pour city
    public String getCity() {
        return city.get();
    }

    // Setter pour city
    public void setCity(String city) {
        this.city.set(city);
    }

    // Property getter pour firstName
    public StringProperty firstNameProperty() {
        return firstName;
    }

    // Property getter pour lastName
    public StringProperty lastNameProperty() {
        return lastName;
    }

    // Property getter pour city
    public StringProperty cityProperty() {
        return city;
    }
}