public class Ticket {

    protected String code;
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
    
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code != null ? code.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        //i found this on the internet and it's somewhat of a standard practice, 31 is a prime number
        // and bitwise move with the xor is made to create a more uniform distribution
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (Double.compare(ticket.price, price) != 0) return false;
        return code != null ? code.equals(ticket.code) : ticket.code == null;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }

}
