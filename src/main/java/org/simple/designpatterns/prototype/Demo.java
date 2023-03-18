package org.simple.designpatterns.prototype;

public class Demo {
    public static void main(String[] args) {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("Bekkerey", 54));
        Person mike = john;

    }
}
