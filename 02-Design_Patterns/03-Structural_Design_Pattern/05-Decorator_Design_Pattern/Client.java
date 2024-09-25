import Pizza.*;
import Topping.*;

public class Client {
    public static void main(String[] args) {
        // create a pizza Marghreta + Corns
        BasePizza pizza1 = new Corns(new Marghreta());
        System.out.println("Cost of Marghreta Pizza with Corns topping: "+pizza1.cost());

        // create a pizza Farm House + Mushroom + Extra Cheese
        BasePizza pizza2 = new ExtraCheese(new Mushroom(new FarmHouse()));
        System.out.println("Cost of Farm House Pizza with Mushroom toppings and extra cheese: "+pizza2.cost());

        // create a pizza Veggie Delight + Corns + Mushroom + Extra Cheese
        BasePizza pizza3 = new Mushroom(new ExtraCheese(new Corns(new VeggieDelight())));
        System.out.println("Cost of Veggie Delight with Corns and Mushroom topping and extra cheese: "+pizza3.cost());
    }
}
