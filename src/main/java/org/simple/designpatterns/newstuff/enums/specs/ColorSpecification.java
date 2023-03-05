package org.simple.designpatterns.newstuff.enums.specs;

import org.simple.designpatterns.newstuff.enums.Product;
import org.simple.designpatterns.newstuff.enums.categories.Color;

public class ColorSpecification implements Specification<Product> {
    private Color color;
    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return p.color == color;
    }
}
