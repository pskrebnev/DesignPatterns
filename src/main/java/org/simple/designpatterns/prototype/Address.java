package org.simple.designpatterns.prototype;

public class Address {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address:"
                + System.lineSeparator()
                + "street name = " + streetName
                + System.lineSeparator()
                + "house number = " + houseNumber;
    }
}
