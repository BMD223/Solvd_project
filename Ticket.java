public class Ticket {
    private String code;
    double price;

    public Ticket() {
    }
    public Ticket(String code, double price) {
        this.code = code;
        this.price = price;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
