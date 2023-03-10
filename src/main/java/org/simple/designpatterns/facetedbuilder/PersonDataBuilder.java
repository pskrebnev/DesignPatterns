package org.simple.designpatterns.facetedbuilder;

public class PersonDataBuilder extends PersonBuilder{
    public PersonDataBuilder(Person person) {
        this.person = person;
    }

    public PersonDataBuilder firstName(String firstName) {
        person.firstName = firstName;
        return this;
    }

    public PersonDataBuilder lastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    public PersonDataBuilder age(int age) {
        person.age = age;
        return this;
    }
}
