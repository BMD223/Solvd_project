import CustomExceptions.InvalidReasonException;

public class ReducedTicket extends Ticket{
    enum VALID_REASONS{
        STUDENT, SENIOR, CHILD, REFUND
    }
    private String reason;
    Movie movie;

    public ReducedTicket(String code, double price,Movie movie, String reason) throws InvalidReasonException {
        this.setCode(code);
        this.setPrice(price);
        try {
            if (reason.toUpperCase().equals(VALID_REASONS.STUDENT.toString()) || reason.toUpperCase().equals(VALID_REASONS.SENIOR.toString()) || reason.toUpperCase().equals(VALID_REASONS.CHILD.toString()) || reason.toUpperCase().equals(VALID_REASONS.REFUND.toString())) {
                this.reason = reason;
            } else {
                throw new InvalidReasonException("Invalid reason");
            }
            this.movie = movie;
        } finally {
            System.out.println("Ticket created");
        }
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
