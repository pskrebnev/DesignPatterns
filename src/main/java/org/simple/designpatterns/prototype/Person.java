package org.simple.designpatterns.prototype;

import java.util.Arrays;

public class Person {
    public String[] names;
    public Address address;

    public Person (String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person: "
                + System.lineSeparator()
                + "names = " + Arrays.toString(names)
                + System.lineSeparator()
                + "address = " + address;
    }
}
