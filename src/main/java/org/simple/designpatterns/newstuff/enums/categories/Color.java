package org.simple.designpatterns.newstuff.enums.categories;

public enum Color {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    PURPLE("Purple"),
    PINK("Pink"),
    BROWN("Brown");

    public final String label;

    private Color(String label) {
        this.label = label;
    }
}
