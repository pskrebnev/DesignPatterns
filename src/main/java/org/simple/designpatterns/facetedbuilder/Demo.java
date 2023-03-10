package org.simple.designpatterns.facetedbuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();

        Person person = pb
                .lives()
                .at("Falcone str")
                .in("Vancouver")
                .withCode("569875AAA")
                .works()
                .workingAt("NASA")
                .hasPosition("Astronaut")
                .hasIncome(500000)
                .createPerson()
                .firstName("Wasia")
                .lastName("Pupkin")
                .age(25)
                .build();

        System.out.println(person);

    }
}
