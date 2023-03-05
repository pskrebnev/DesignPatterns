package org.simple.designpatterns.newstuff.enums;

import org.simple.designpatterns.newstuff.enums.categories.Color;
import org.simple.designpatterns.newstuff.enums.categories.Fruit;
import org.simple.designpatterns.newstuff.enums.categories.Size;

public class Product {
    public String name;
    public Color color;
    public Fruit fruit;
    public Size size;

    public Product(String name, Fruit fruit, Color color, Size size) {
        this.name = name;
        this.fruit = fruit;
        this.color = color;
        this.size = size;
    }
}
