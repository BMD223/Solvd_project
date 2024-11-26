public abstract class Extras implements Consumable, Purchasable, Namable {
    protected double price;
    protected String name;
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

    public abstract void printSize();
    
}
