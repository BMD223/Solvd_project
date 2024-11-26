import java.util.Date;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Offer {
    private static Map<Movie, ArrayList<Date>> screenings = new HashMap<>();
    private static ArrayList<Extras> food = new ArrayList<>();

    public static void setScreenings(Map<Movie, ArrayList<Date>> screenings) {
        Offer.screenings = screenings;
    }

    public static Map<Movie, ArrayList<Date>> getScreenings() {
        return screenings;
    }

    public static void addScreening(Movie movie, ArrayList<Date> dates) {
        screenings.put(movie, dates);
    }

    public static void removeScreening(Movie movie) {
        screenings.remove(movie);
    }

    public static ArrayList<Extras> getFood() {
        return food;
    }

    public static void setFood(ArrayList<Extras> food) {
        Offer.food = food;
    }

    static {
        // Initialization block
        System.out.println("Offer class is being initialized...");
        food = new ArrayList<>();
        screenings = new HashMap<>();
    }
}
