package org.simple.designpatterns.newstuff.enums.specs;

import org.simple.designpatterns.newstuff.enums.Product;
import org.simple.designpatterns.newstuff.enums.categories.Fruit;

public class FruitSpecification implements Specification<Product> {
    private Fruit fruit;

    public FruitSpecification(Fruit fruit) {
        this.fruit = fruit;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.fruit == fruit;
    }
}
