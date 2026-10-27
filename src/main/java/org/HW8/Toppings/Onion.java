package org.HW8.Toppings;

import org.HW8.models.Food;

public class Onion extends ToppingDecorator {

    public Onion(Food food) {
        super(food);
    }
    @Override
    public String getItemName() {
        return food.getItemName() + " + Onion ";
    }
    @Override
    public double getPrice() {
        return this.food.getPrice() + 0.25;
    }
}
