package org.HW8.models;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

enum ToppingsDef {
    ONIONS,
    CHEESE,
    KETCHUP,
    MAYO,
    MUSTARD,
    PICKLES,
    RANCH
}

public class Toppings {
    public static Map<String, Double> toppings = new HashMap<>(){{put(ToppingsDef.ONIONS.name(), 0.25); put(ToppingsDef.RANCH.name(), 1.25);put(ToppingsDef.PICKLES.name(), 0.50);put(ToppingsDef.MUSTARD.name(), 0.05);put(ToppingsDef.MAYO.name(), 0.05);put(ToppingsDef.KETCHUP.name(), 0.05);put(ToppingsDef.CHEESE.name(), 0.25);}};
}
