package Example_1;

public class Invoice {
    private Marker marker;
    private int quantity;

    // define constructor
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    // define a method to calculate total cost
    public int totalCost(Marker marker, int quantity){
        return this.marker.price*quantity;
    }

    // define a method to store invoice to database
    public void saveToDB(){
        System.out.println("Invoice saved to Database");
        // define hibernate logic
    }
}
