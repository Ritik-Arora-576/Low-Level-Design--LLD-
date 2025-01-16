package Seat;

public class Seat {
    private int id;
    private Boolean isAvailable;
    private Category category;
    private int price;

    public Seat(int id, Category category, int price) {
        this.id = id;
        this.isAvailable = true;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
