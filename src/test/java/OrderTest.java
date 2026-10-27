import org.HW8.Toppings.Cheese;
import org.HW8.Toppings.Ketchup;
import org.HW8.Toppings.Onion;
import org.HW8.models.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Food foodItem;
    Customer cust1 = new Customer("Sabrina Ferras");

    @Test
    public void testHotDogPrice(){
        foodItem = new HotDog();
        double expected = 7.99;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testHotDogWithToppingPrice(){
        foodItem = new HotDog();
        foodItem = new Ketchup(foodItem);

        double expected = 7.99 + 0.05;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testFriesPrice(){
        foodItem = new Fries();
        double expected = 4.99;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testFriesKetchupPrice(){
        foodItem = new Fries();
        foodItem = new Ketchup(foodItem);

        double expected = 4.99 + 0.05;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testBurgerPrice(){
        foodItem = new Burger();
        double expected = 8.99;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testBurgerKetchupPrice(){
        foodItem = new Burger();
        foodItem = new Ketchup(foodItem);

        double expected = 8.99 + 0.05;
        double actual= foodItem.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderWithLoyaltyDiscount(){

        foodItem = new Burger();
        foodItem = new Ketchup(foodItem);
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

        double expected = 25.77;
        double actual= cust1Order.getTotal();
        assertEquals(expected, actual);
    }

}
