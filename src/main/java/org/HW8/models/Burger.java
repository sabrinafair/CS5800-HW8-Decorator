package org.HW8.models;

public class Burger implements Food{
    public Burger() {
    }

    @Override
    public String getItemName() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return 8.99;
    }
}
