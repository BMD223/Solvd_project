import java.util.Map;
import java.util.HashMap;

public class DiscountRecord {
    private Map<String,Double> discounts;

    public DiscountRecord(String s, double d){
        discounts=new HashMap<String,Double>();
        discounts.put(s,d);
    }
    public DiscountRecord(Map<String,Double> sd){
        discounts=sd;
    }

    public void setDiscounts(Map<String, Double> discounts) {
        this.discounts = discounts;
    }

    public void addDiscount(String s, Double d){
        discounts.put(s,d);
    }
    public void removeDiscount(String s){
        discounts.remove(s);
    }

    public Map<String, Double> getDiscounts() {
        return discounts;
    }
}
