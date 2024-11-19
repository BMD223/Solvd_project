import java.util.ArrayList;
import java.util.Date;

public class Admin extends Employee{
    //made a protected constructor which will still work in main, as the package remains the same
    protected Admin(String name, String surname, String email, int id) {
        super(name,surname,email, id);
    }

    void modifyOffer(Offer offer, boolean add, Movie movie, ArrayList<Date> dates){
        if(add){
            offer.addScreening(movie,dates);
        }
        else{
            offer.removeScreening(movie);
        }
    }
    public String getIdentification(String type) {
        if(type =="ID_ONLY"){
            return this.getID() + ""; // we might also just want his id without his role.
        } else if (type=="E-MAIL"){
            return this.getEmail();  //if we need to know the admin's email
        }
    
        System.out.println("Wrong request!");
        return "";
    }
    @Override
    public String getIdentification() {
        return "Role: Administrator, ID: "+ this.getID();
    }
}
