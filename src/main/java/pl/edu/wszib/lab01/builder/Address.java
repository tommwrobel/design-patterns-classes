package pl.edu.wszib.lab01.builder;

public class Address {
    private String city;
    private String streetName;
    private String homeNumber;
    private String postalCode;

    private Address(String city, String streetName, String homeNumber, String postalCode) {
        this.city = city;
        this.streetName = streetName;
        this.homeNumber = homeNumber;
        this.postalCode = postalCode;
    }

    public static class Builder {
        private String city;
        private String streetName;
        private String homeNumber;
        private String postalCode;

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder homeNumber(String homeNumber) {
            this.homeNumber = homeNumber;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address build() {
            return new Address(city, streetName, homeNumber, postalCode);
        }
    }
}
