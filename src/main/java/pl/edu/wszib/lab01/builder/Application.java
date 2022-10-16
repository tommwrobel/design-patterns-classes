package pl.edu.wszib.lab01.builder;

public class Application {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Tomek")
                .lastName("Adrian")
                .age(55)
                .address(new Address.Builder()
                        .city("Wroclaw")
                        .streetName("Krakowska")
                        .homeNumber("14A")
                        .postalCode("34-345")
                        .build())
                .build();

        System.out.println(person);
    }
}
