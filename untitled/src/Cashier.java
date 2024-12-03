import CustomExceptions.UnknownProductException;
import java.util.ArrayList;

import java.util.ArrayList;

public class Cashier extends Employee{
    private double sales=0;
    protected int hoursWorked=0;

    public Cashier(String name, String surname, String email, int id) {
        super(name,surname,email, id);
    }

    public double getSales() {
        return sales;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void sellSnacks(double price, String snackName) throws UnknownProductException{
        ArrayList<Extras> currentOffer = (ArrayList<Extras>) Offer.getFood().clone();
        for(Extras e : currentOffer){
            if(e.getName().equals(snackName)){
                sales+=price;
                System.out.println("Snack sold!");
                return;
            }
        }
        throw new UnknownProductException("Snack not found");
    }

    @Override
    public String getIdentification() {
        return "Role: Cashier, ID: "+ this.getID();
    }

    @Override
    public void getGreeting() {
        System.out.println("Hello, I'm the cashier. How can I help you?");
    }
}
