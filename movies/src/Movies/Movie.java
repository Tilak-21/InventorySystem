package Movies;

public class Movie {
    private String title;
    private int year;
    private double durationMinutes;

    public Movie(String title, int year, double durationMinutes) {
        this.title = title;
        this.year = year;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString(){
        return "Movie title: " +getTitle() +
                " Year: " + getYear() +
                " Length: " + getDurationMinutes() + " minutes.";
    }

}
