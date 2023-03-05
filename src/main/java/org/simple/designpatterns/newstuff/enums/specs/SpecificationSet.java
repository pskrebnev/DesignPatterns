package org.simple.designpatterns.newstuff.enums.specs;

public class SpecificationSet<T> implements Specification<T> {

    private Specification<T> first, second, third;

    public SpecificationSet(Specification<T> first) {
        this.first = first;
    }

    public SpecificationSet(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    public SpecificationSet(
            Specification<T> first
            , Specification<T> second
            , Specification<T> third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item) && third.isSatisfied(item);
    }
}
