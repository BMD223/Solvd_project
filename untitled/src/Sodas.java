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

}
