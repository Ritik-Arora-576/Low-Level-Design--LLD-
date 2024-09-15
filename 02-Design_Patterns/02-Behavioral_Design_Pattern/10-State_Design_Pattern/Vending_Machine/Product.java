package Vending_Machine;
public class Product {
    private String name;
    private int cost;
    private int quantity;

    public Product(String name, int cost, int quantity){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", cost=" + cost + ", quantity=" + quantity + "]";
    }
}
