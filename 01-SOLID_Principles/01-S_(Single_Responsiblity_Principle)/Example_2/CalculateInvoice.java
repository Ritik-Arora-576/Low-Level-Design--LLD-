package Example_2;

public class CalculateInvoice {
    private Marker marker;
    private int quantity;

    // define constructor
    public CalculateInvoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    // define a method to calculate total cost
    public int totalCost(Marker marker, int quantity){
        return this.marker.price*quantity;
    }
}
