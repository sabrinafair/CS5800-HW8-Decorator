package org.HW8.Toppings;

import org.HW8.models.Food;

public class Ketchup extends ToppingDecorator {

    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public String getItemName() {
        return food.getItemName() + " + Ketchup";
    }
    @Override
    public double getPrice() {
        return this.food.getPrice() + 0.05;
    }
}
