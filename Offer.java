import java.util.Date;
import java.util.Map;
import java.util.ArrayList;

public class Offer {

    Map<Movie, ArrayList<Date>> screenings;

    ArrayList<Extras> food;

    public void setScreenings(Map<Movie, ArrayList<Date>> screenings) {
        this.screenings = screenings;
    }

    public Map<Movie, ArrayList<Date>> getScreenings() {
        return screenings;
    }

    public void addScreening(Movie movie,ArrayList<Date> dates){
        screenings.put(movie,dates);
    }
    public void removeScreening(Movie movie){
        screenings.remove(movie);
    }

    public ArrayList<Extras> getFood() {
        return food;
    }

    public void setFood(ArrayList<Extras> food) {
        this.food = food;
    }
}
