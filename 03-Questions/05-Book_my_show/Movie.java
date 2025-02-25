public class Movie {
    private int id;
    private String title;
    private String description;
    private int durationInMinute;

    public Movie(int id, String title, String description, int durationInMinute){
        this.id = id;
        this.title = title;
        this.description = description;
        this.durationInMinute = durationInMinute;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }
}
