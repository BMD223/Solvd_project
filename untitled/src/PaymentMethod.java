public class PaymentMethod implements Namable{
    String name;
    double fee;

    public PaymentMethod(String n,double f){
        name=n;
        fee=f;
    }

    public double getFee() {
        return fee;
    }

    public String getName() {
        return name;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setName(String name) {
        this.name = name;
    }
}
