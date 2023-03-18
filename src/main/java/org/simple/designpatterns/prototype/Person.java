package org.simple.designpatterns.prototype;

import java.util.Arrays;

public class Person implements Cloneable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return new Person(names.clone(), (Address) address.clone());
    }
}
