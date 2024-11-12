import java.util.ArrayList;
import java.util.Date;

public class Admin extends Employee{

    public Admin(String name, String surname, String email, int id) {
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

}
