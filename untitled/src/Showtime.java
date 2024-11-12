import java.util.Date;

public class Showtime {
    Venue ven;
    Date date;
    Movie movie;

    public Showtime(Venue v, Date d, Movie m){
        ven=v;
        date=d;
        movie=m;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setVen(Venue ven) {
        this.ven = ven;
    }

    public Movie getMovie() {
        return movie;
    }

    public Date getDate() {
        return date;
    }

    public Venue getVen() {
        return ven;
    }
}
