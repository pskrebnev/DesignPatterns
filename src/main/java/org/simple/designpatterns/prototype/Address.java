package org.simple.designpatterns.prototype;

public class Address implements Cloneable {
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

    // deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(streetName, houseNumber);
    }
}
