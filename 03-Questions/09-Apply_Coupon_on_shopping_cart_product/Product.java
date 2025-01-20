public class Product{
    private int id;
    private String name;
    private double price;
    private ProductType type;

    public Product(){}

    public Product(int id, String name, double price, ProductType type){
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductType getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}