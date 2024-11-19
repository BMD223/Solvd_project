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

    public void sellSnacks(double price){
        sales+=price;
    }

    @Override
    public String getIdentification() {
        return "Role: Cashier, ID: "+ this.getID();
    }

}
