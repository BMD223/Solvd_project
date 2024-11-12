import java.util.Map;
import java.util.HashMap;

public class Discount {
    Map<String,Double> discounts;

    public Discount(String s, double d){
        discounts=new HashMap<String,Double>();
        discounts.put(s,d);
    }
    public Discount(Map<String,Double> sd){
        discounts=sd;
    }

    public void setDiscounts(Map<String, Double> discounts) {
        this.discounts = discounts;
    }

    public Map<String, Double> getDiscounts() {
        return discounts;
    }
}
