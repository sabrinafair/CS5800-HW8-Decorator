package org.HW8.Toppings;

import org.HW8.models.Food;

public abstract class ToppingDecorator implements Food {
    protected Food food;

    public ToppingDecorator(Food food) {
        this.food = food;
    }
}
