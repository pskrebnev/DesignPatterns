package org.simple.designpatterns.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("Bekkerey", 54));
        Person mike = (Person) john.clone();
        mike.names[0] = "Mike";
        mike.address.houseNumber = 228;

        System.out.println(john);
        System.out.println(mike);
    }
}
