package org.simple.designpatterns.abstractfactory;

public class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is super!!");
    }
}
