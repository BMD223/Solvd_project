public class Sodas extends Drinks{

    String brand;
    Boolean sugar;
    String flavor;

    public Sodas(String b, Boolean s, String fl, String n, double p, int c, Boolean i){
        super(n,p,c,i);
        brand=b;
        sugar=s;
        flavor=fl;
    }
    public String getBrand() {
        return brand;
    }
    public String getFlavor() {
        return flavor;
    }
    public Boolean getSugar() {
        return sugar;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void setSugar(Boolean sugar) {
        this.sugar = sugar;
    }

}
