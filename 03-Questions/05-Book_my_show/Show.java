import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import Seat.*;

public class Show {
    private int id;
    private Movie movie;
    private Theatre theatre;
    private int startTime;
    private int endTime;
    private Map<Integer, Seat> seats;

    public Show(int id, Movie movie, Theatre theatre, int startTime, int endTime, int n_silver, int n_gold, int n_platinum) {
        this.id = id;
        this.movie = movie;
        this.theatre = theatre;
        this.startTime = startTime;
        this.endTime = endTime;
        this.theatre.addShow(this);
        this.seats = new ConcurrentHashMap<>();
        this.initializeSeats(n_silver, n_gold, n_platinum);
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public Seat getSeatByID(int id){
        if(seats.containsKey(id)) return seats.get(id);
        return null;
    }

    private void initializeSeats(int n_silver, int n_gold, int n_platinum){
        for(int i=0;i<n_silver;i++){
            Seat seat = new Seat(i, Category.SILVER, 150);
            this.seats.put(seat.getId(), seat);
        }

        for(int i=n_silver;i<n_silver+n_gold;i++){
            Seat seat = new Seat(i, Category.GOLD, 200);
            this.seats.put(seat.getId(), seat);
        }

        for(int i=n_silver+n_gold;i<n_silver+n_gold+n_platinum;i++){
            Seat seat = new Seat(i, Category.PLATINUM, 250);
            this.seats.put(seat.getId(), seat);
        }
    }
}
