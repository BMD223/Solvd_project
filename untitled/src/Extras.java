public class Extras {
    double price;
    String name;
    public Extras(String n,double p){
        price=p;
        name=n;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
