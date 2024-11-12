public class RegularTicket extends Ticket{
    Movie movie;

    public RegularTicket(String code, Double price, Movie movie){
        super(code,price);
        this.movie=movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
