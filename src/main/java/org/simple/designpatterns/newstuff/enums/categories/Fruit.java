package org.simple.designpatterns.newstuff.enums.categories;

public enum Fruit {
    ARUGULA("Arugula"),
    AVOCADOS("Avocados"),
    BASIL("Basil"),
    BROCCOLI("Broccoli"),
    CARROTS("Carrots"),
    CHERRIES("Cherries"),
    CUCUMBER("Cucumber"),
    EGGPLANT("Eggplant"),
    FENNEL("Fennel"),
    FIGS("Figs"),
    GARLIC("Garlic"),
    GRAPEFRUITS("Grapefruits"),
    KOHLRABI("Kohlrabi"),
    MORELS("Morels");

    public String label;

    private Fruit(String label) {
        this.label = label;
    }
}
