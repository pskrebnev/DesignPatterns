package org.simple.designpatterns.abstractfactory;

import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HotDrinkMachine {
    private Map<AvailableDrink, IHotDrinkFactory> factories = new HashMap<>();
    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws NoSuchMethodException
            , ClassNotFoundException
            , InvocationTargetException
            , InstantiationException
            , IllegalAccessException {
        // option 1: use an enum
        for (AvailableDrink drink : AvailableDrink.values()) {
            String s = drink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0))
                    + s.substring(1).toLowerCase();
            Class<?> factory = Class.forName("org.simple.designpatterns.abstractfactory."
                    + factoryName + " -- the Factory");
            factories.put(drink, (IHotDrinkFactory) factory.getDeclaredConstructor().newInstance());
        }

        // option 2: find all implementations of IHotDrinkFactory
        Set<Class<? extends IHotDrinkFactory>> types =
                new Reflections("org.simple.designpatterns.abstractfactory")
                        .getSubTypesOf(IHotDrinkFactory.class);
        for (Class<? extends IHotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", "")
                    , type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public IHotDrink makeDrink() throws IOException {
        System.out.println("Available drinks");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, IHotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getValue0());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i;
            int amount;
            if ((s = br.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()) {
                System.out.println("Specify amount: ");
                s = br.readLine();

                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
                System.out.println("Incorrect input, try again.");
            }
        }
    }

    public IHotDrink makeDrink(AvailableDrink drink, int amount) {
        return ((IHotDrinkFactory) factories.get(drink)).prepare(amount);
    }
}
