package org.simple.designpatterns.openclose;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.MEDIUM);
        Product potato = new Product("Potato", Color.RED, Size.HUGE);
        Product tree = new Product("Oak", Color.GREEN, Size.HUGE);
        Product house = new Product("Big house", Color.BLUE, Size.SMALL);

        List<Product> products = List.of(apple, potato, tree, house);

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old implementation)");
        pf.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.name + " is green"));

    }
}