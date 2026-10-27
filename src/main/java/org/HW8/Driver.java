package org.HW8;

import org.HW8.Toppings.Cheese;
import org.HW8.Toppings.Ketchup;
import org.HW8.Toppings.Onion;
import org.HW8.models.*;

public class Driver {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Sabrina Ferras");
        cust1.setLoyalty(Statuses.GOLD);
        Order cust1Order = new Order(cust1);
        //Plain
        Food plainHotdog = new HotDog();
        cust1Order.addItem(plainHotdog);
        //2nd hotdog
        Food hotdog = new HotDog();
        hotdog = new Onion(hotdog);
        cust1Order.addItem(hotdog);

        Food burger = new Burger();
        burger = new Onion(burger);
        burger = new Cheese(burger);
        burger = new Ketchup(burger);
        cust1Order.addItem(burger);

        cust1Order.printReceipt();



    }
}