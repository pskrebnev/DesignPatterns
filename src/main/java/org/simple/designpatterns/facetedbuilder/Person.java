package org.simple.designpatterns.facetedbuilder;

public class Person {
    // address
    public String streetAddress;
    public String postCode;
    public String city;

    // job description
    public String companyName;
    public String position;
    public int income;

    // personal data
    public String firstName;
    public String lastName;
    public int age;

    @Override
    public String toString() {
        String personalData = "Person: {First, Last Name and Age : "
                + firstName + " " + " " + lastName + " with age = " + age + "}";
        String jobData = "Job: {Company, Position, Income : "
                + companyName + ", " + position + ", " + income + "}";
        String addressData = "Address: {Street, Code, City : "
                + streetAddress + ", " + postCode + ", " + city + "}";
        return personalData + System.lineSeparator()
                + jobData + System.lineSeparator()
                + addressData + System.lineSeparator();
    }
}
