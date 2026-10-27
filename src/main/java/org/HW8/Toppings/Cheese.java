package org.HW8.Toppings;

import org.HW8.models.Food;

public class Cheese extends ToppingDecorator {
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public String getItemName() {
        return food.getItemName() + " + Cheese";
    }

    @Override
    public double getPrice() {
        return this.food.getPrice() + 0.25;
    }
}
