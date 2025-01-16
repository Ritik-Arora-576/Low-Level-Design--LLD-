import java.util.ArrayList;
import java.util.List;

public class User{
    private int id;
    private String name;
    private String location;
    private List<Booking> bookings;

    public User(int id, String name, String location){
        this.id = id;
        this.name = name;
        this.location = location;
        this.bookings = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking){
        this.bookings.remove(booking);
    }
}