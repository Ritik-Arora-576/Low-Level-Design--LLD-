import java.util.List;
import Seat.*;

public class Booking {
    private int id;
    private BookingStatus status;
    private User user;
    private Show show;
    private List<Seat> bookedSeats;
    private int bill;

    public Booking(int id, User user, Show show, List<Seat> bookedSeats){
        this.id = id;
        this.status = BookingStatus.PENDING;
        this.user = user;
        this.show = show;
        this.bookedSeats = bookedSeats;
        this.bill = 0;
    }

    public int getId() {
        return id;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setStatus(BookingStatus status){
        this.status = status;
    }

    

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public synchronized boolean bookedSeats(){
        Boolean allSeatsAvailable = true;

        for(int i=0;i<bookedSeats.size();i++){
            if(!bookedSeats.get(i).getIsAvailable()){
                allSeatsAvailable = false;
                break;
            }
        }

        if(allSeatsAvailable){
            for(int i=0;i<bookedSeats.size();i++){
                bookedSeats.get(i).setIsAvailable(false);
                setBill(getBill() + bookedSeats.get(i).getPrice());
            }
        }

        return allSeatsAvailable;
    }

    public void cancelBooking(){
        if(status==BookingStatus.CONFIRMED){
            this.setStatus(BookingStatus.CANCELLED);

            for(int i=0;i<bookedSeats.size();i++){
                bookedSeats.get(i).setIsAvailable(true);
            }

            this.user.removeBooking(this);
        }
    }
}
