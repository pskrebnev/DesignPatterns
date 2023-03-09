package org.simple.designpatterns.builder;

import org.simple.designpatterns.builder.htmlbuilder.HtmlBuilder;

public class Demo {
    public static void main(String[] args) {
        HtmlBuilder hBuilder = new HtmlBuilder("ul");
        hBuilder.addChild("li", "Hello, ");
        hBuilder.addChild("li", "World!");
        System.out.println(hBuilder);
    }
}
