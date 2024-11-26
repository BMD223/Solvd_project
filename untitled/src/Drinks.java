public class Drinks extends Extras{

    protected int mililiters;
    protected boolean ice;

    public Drinks(String n, double p, int c, Boolean i){
        super(n,p);
        mililiters=c;
        ice=i;

    }

    @Override
    public final void printSize() {
        System.out.printf("This drink's volume is: %d milliliters.%n", mililiters);
    }



}
