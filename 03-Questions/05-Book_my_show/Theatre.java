import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private int id;
    private String name;
    private String location;
    private List<Movie> movies;
    private List<Show> shows;

    public Theatre(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.movies = new ArrayList<>();
        this.shows = new ArrayList<>();
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

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addMovie(Movie movie){
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie){
        this.movies.remove(movie);
    }

    public void addShow(Show show){
        this.shows.add(show);
    }

    public void removeShow(Show show){
        this.shows.remove(show);
    }
}
