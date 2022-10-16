package pl.edu.wszib.lab01.builder;

import com.google.auto.value.AutoValue;

@AutoValue
public class Animal {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Animal(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
