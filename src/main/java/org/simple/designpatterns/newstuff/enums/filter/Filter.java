package org.simple.designpatterns.newstuff.enums.filter;

import org.simple.designpatterns.newstuff.enums.specs.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    Stream<T> filter(List<T> items, Specification<T> spec);
}
