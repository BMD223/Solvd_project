public class ReducedTicket extends Ticket{
    enum VALID_REASONS{
        STUDENT, SENIOR, CHILD, REFUND
    }
    private String reason;
    Movie movie;

    public ReducedTicket(String code, double price,Movie movie, String reason) {
        this.setCode(code);
        this.setPrice(price);
        this.reason = reason;
        this.movie =movie;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }
}
