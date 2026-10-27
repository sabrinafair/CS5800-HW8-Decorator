package org.HW8.models;

public class HotDog implements Food{
    public HotDog() {
    }

    @Override
    public String getItemName() {
        return "Hot Dog";
    }

    @Override
    public double getPrice() {
        return 7.99;
    }
}
