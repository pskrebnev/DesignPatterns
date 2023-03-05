package org.simple.designpatterns.newstuff.enums.categories;

public enum Size {
    TINY("TINY"),
    SMALL("SMALL"),
    NORMAL("NORMAL"),
    BIG("BIG"),
    HUGE("HUGE");

    public final String label;

    private Size(String label) {
        this.label = label;
    }
}
