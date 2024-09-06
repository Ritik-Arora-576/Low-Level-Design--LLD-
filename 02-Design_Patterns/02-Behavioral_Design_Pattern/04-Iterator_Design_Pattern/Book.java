public class Book {
    public String name;
    public Integer price;

    public Book(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", price=" + price + "]";
    }
}
