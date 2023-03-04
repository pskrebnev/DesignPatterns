package org.simple.designpatterns.newstuff.enums;

import org.simple.designpatterns.newstuff.enums.categories.Color;

public class Test {
    public static void main(String[] args) {
        System.out.println(Color.BLUE.label + " -- label");
        System.out.println(Color.BLUE + " pure enum");
    }
}
