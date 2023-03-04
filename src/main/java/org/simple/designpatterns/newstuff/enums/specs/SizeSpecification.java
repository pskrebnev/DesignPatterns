package org.simple.designpatterns.newstuff.enums.specs;

import org.simple.designpatterns.newstuff.enums.Product;
import org.simple.designpatterns.newstuff.enums.categories.Size;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public  SizeSpecification (Size size) {
        this.size = size;
    }
    @Override
    public boolean isSatisfied(Product p) {
        return p.size == size;
    }
}
