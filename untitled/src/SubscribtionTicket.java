public class SubscribtionTicket extends Ticket{

    int limit;

    public SubscribtionTicket(String code, double price, int limit) {
        setCode(code);
        this.price = price;
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
