package org.simple.designpatterns.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine
                .makeDrink(AvailableDrink.COFFEE, 200);
        tea.consume();

        // interactive
        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
