import java.util.ArrayList;

public class Snacks extends Extras{

    Boolean healthy;
    char size;
    ArrayList<String> allergens;

    public Snacks(String n,double p, Boolean h, char s, ArrayList<String> al){
        super(n,p);
        healthy=h;
        size=s;
        allergens=al;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public Boolean getHealthy() {
        return healthy;
    }

    public char getSize() {
        return size;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
