package pl.edu.wszib.lab01.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Address address;

    private Person(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private Address address;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder address(Address address) {
            this.address = address;
            return this;
        }
        public Person build() {
            return new Person(firstName, lastName, age, address);
        }
    }
}
