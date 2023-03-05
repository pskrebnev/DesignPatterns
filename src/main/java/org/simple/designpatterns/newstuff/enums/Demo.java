package org.simple.designpatterns.newstuff.enums;

import org.simple.designpatterns.newstuff.enums.categories.Color;
import org.simple.designpatterns.newstuff.enums.categories.Fruit;
import org.simple.designpatterns.newstuff.enums.categories.Size;
import org.simple.designpatterns.newstuff.enums.filter.FilterImproved;
import org.simple.designpatterns.newstuff.enums.specs.ColorSpecification;
import org.simple.designpatterns.newstuff.enums.specs.FruitSpecification;
import org.simple.designpatterns.newstuff.enums.specs.SizeSpecification;
import org.simple.designpatterns.newstuff.enums.specs.SpecificationSet;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product avocados01 = new Product("Avocado 01", Fruit.AVOCADOS, Color.GREEN, Size.NORMAL);
        Product fig01 = new Product("Figa 01", Fruit.FIGS, Color.BROWN, Size.NORMAL);
        Product kolhrabi01 = new Product("Kohlrabi 01", Fruit.KOHLRABI, Color.GREEN, Size.NORMAL);
        Product kolhrabi02 = new Product("Kohlrabi 02", Fruit.KOHLRABI, Color.GREEN, Size.BIG);
        Product kolhrabi03 = new Product("Kohlrabi 03", Fruit.KOHLRABI, Color.GREEN, Size.NORMAL);

        List<Product> products = List.of(avocados01, fig01, kolhrabi01, kolhrabi02, kolhrabi03);

        FilterImproved fi = new FilterImproved();

        System.out.println("GREEN PRODUCTS");
        fi.filter(products, new SpecificationSet<>(new ColorSpecification(Color.GREEN)
                        , new SizeSpecification(Size.NORMAL)
                        , new FruitSpecification(Fruit.KOHLRABI)))
                .forEach(p -> System.out.println(p.name + " is "
                        + p.fruit + ", " + p.size + " and has color "
                        + p.color));
//        fi.filter(products, new SpecificationSet<>(new ColorSpecification(Color.GREEN)))
//                .forEach(p -> System.out.println(p.name + " is "
//                        + p.fruit + ", " + p.size + " and has color "
//                        + p.color));
    }
}
