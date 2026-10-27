package org.HW8.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    Customer customer;
    List<Food> items = new ArrayList<>();;
    int orderNumber;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderNumber = generateRandomNumber();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(Food food) {
        this.items.add(food);
    }

    public List<Food> getItems() {
        return items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFood(List<Food> items) {
        this.items = items;
    }

    public void printReceipt(){
        double totalCost = 0;
        System.out.println("-----------------------------------------");
        System.out.println("-----------------RECEIPT-----------------");
        System.out.println("-----------------------------------------");
        System.out.println("ORDER NUMBER: " + this.orderNumber);
        System.out.println("CUSTOMER: " + this.customer.getName());
        for(Food food: this.items){
            totalCost += food.getPrice();
            System.out.println("ITEM: " +food.getItemName() + " " + food.getPrice());
        }
        System.out.println("-----------------------------------------");

        System.out.println("TOTAL: " + totalCost);
        System.out.println("-----------------------------------------");

    }

    public int generateRandomNumber(){
        int min = 1000, max = 9999;
        int randomInt = (int)(Math.random() * ((max - min) + 1)) + min;
        return randomInt;
    }
}
