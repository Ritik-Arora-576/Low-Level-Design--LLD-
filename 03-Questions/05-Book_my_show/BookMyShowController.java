import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import Payment.PaymentContext;
import Payment.PaymentStatus;
import Payment.UPIPayment;
import Seat.*;

public class BookMyShowController {
    private static BookMyShowController instance;
    public PaymentContext payment;
    private Map<Integer, Movie> movies;
    private Map<Integer, Theatre> theatres;
    private Map<Integer, Booking> bookings;
    private Map<Integer, User> users;
    private int booking_counter;

    private BookMyShowController(){
        if(instance!=null){
            System.out.println("Instance has already been created");
            this.payment = new PaymentContext(new UPIPayment());
            this.movies = new HashMap<>();
            this.theatres = new HashMap<>();
            this.bookings = new ConcurrentHashMap<>();
            this.users = new HashMap<>();
            this.booking_counter=1;
        }
    }

    public static synchronized BookMyShowController getInstance(){
        if(instance==null){
            instance = new BookMyShowController();
        }
        return instance;
    }

    public PaymentContext getPayment() {
        return payment;
    }

    public Map<Integer, Movie> getMovies() {
        return movies;
    }

    public Map<Integer, Theatre> getTheatres() {
        return theatres;
    }

    public Map<Integer, Booking> getBookings() {
        return bookings;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setPayment(PaymentContext payment) {
        this.payment = payment;
    }

    public void addMovie(Movie movie){
        movies.put(movie.getId(), movie);
    }

    public void removeMovie(Movie movie){
        movies.remove(movie.getId());
    }

    public Movie getMovieByID(int id){
        return movies.get(id);
    }

    public void addTheatre(Theatre theatre){
        theatres.put(theatre.getId(), theatre);
    }

    public void removeTheatre(Theatre theatre){
        theatres.remove(theatre.getId());
    }

    public Theatre getTheatreByID(int id){
        return theatres.get(id);
    }

    public void addUser(User user){
        users.put(user.getId(), user);
    }

    public void removeUser(User user){
        users.remove(user.getId());
    }

    public User getUserByID(int id){
        return users.get(id);
    }

    public void addBooking(Booking booking){
        bookings.put(booking.getId(), booking);
    }

    public void removeBooking(Booking booking){
        bookings.remove(booking.getId());
    }

    public Booking getBookingByID(int id){
        return bookings.get(id);
    }

    public synchronized void makeBooking(User user, Show show, List<Seat> selected_seats){
        for(int i=0;i<selected_seats.size();i++){
            Seat seat = selected_seats.get(i);
            if(show.getSeatByID(seat.getId())==null){
                System.out.println("Choosed seats are unauthorized");
                return;
            }
        }

        Booking booking = new Booking(booking_counter, user, show, selected_seats);

        if(booking.bookedSeats()){
            payment.doPayment(booking.getBill());
            System.out.println("Payment Successfull");
            payment.setStatus(PaymentStatus.COMPLETED);
            booking.setStatus(BookingStatus.CONFIRMED);
            booking_counter++;
            System.out.println("Booking Confirmed");
            addBooking(booking);
        }
    }

    public void cancelBooking(Booking booking){
        booking.cancelBooking();
        removeBooking(booking);
    }
}
