package org.simple.designpatterns.openclose;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
