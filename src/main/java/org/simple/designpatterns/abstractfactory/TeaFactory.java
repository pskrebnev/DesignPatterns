package org.simple.designpatterns.abstractfactory;

public class TeaFactory implements IHotDrinkFactory {
    @Override
    public IHotDrink prepare(int amount) {
        System.out.println(
                "Put in tea bag, boil water," +
                        " pour " + amount + "ml, and" +
                        " lemon. Enjoy!"
        );
        return new Tea();
    }
}
