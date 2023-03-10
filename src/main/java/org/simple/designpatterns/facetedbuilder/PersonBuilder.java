package org.simple.designpatterns.facetedbuilder;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonDataBuilder createPerson() {
        return new PersonDataBuilder(person);
    }

    public Person build() {
        return person;
    }
}
