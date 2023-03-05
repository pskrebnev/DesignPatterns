package org.simple.designpatterns.newstuff.enums.filter;

import org.simple.designpatterns.newstuff.enums.Product;
import org.simple.designpatterns.newstuff.enums.specs.Specification;

import java.util.List;
import java.util.stream.Stream;

public class FilterImproved implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfied(p));
    }
}
