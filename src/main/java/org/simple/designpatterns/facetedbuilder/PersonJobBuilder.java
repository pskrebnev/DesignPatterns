package org.simple.designpatterns.facetedbuilder;

public class PersonJobBuilder extends PersonBuilder {
    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder workingAt(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder hasPosition(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder hasIncome(int income) {
        person.income = income;
        return this;
    }
}
