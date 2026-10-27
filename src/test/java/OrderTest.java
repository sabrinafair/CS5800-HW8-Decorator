import org.HW8.Toppings.Ketchup;
import org.HW8.Toppings.Onion;
import org.HW8.models.Food;
import org.HW8.models.HotDog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Food hotdog;

    @Test
    public void testHotDogPrice(){
        hotdog = new HotDog();
        double expected = 7.99;
        double actual= hotdog.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void testHotDogWithToppingPrice(){
        hotdog = new HotDog();
        hotdog = new Ketchup(hotdog);

        double expected = 7.99 + 0.05;
        double actual= hotdog.getPrice();
        assertEquals(expected, actual);
    }

}
