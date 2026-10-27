package org.HW8.models;

public class Fries implements Food{
    public Fries() {
    }

    @Override
    public String getItemName() {
        return "Fries";
    }

    @Override
    public double getPrice() {
        return 4.99;
    }
}
