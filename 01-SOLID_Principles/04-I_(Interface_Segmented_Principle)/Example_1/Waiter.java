package Example_1;

public class Waiter implements RestaurentEmployee{
    // unneccesary method
    public void washDishes(){
        System.out.println("It's not my job");
    }

    public void serveCostumers(){
        System.out.println("I'll serve the order within 5 minutes.");
    }

    // uneccesary method
    public void cookFood(){
        System.out.println("Ask to chef.");
    }
}
