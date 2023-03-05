package org.simple.designpatterns.newstuff.enums.specs;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
