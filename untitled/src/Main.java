import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        Cashier cashier = new Cashier("Jane","Smith", "jane.smith@example.com",1);

        Admin admin = new Admin("Alice","Johnson", "alice.johnson@example.com",1);

        System.out.println(admin.getIdentification());
        System.out.println(admin.getIdentification("E-MAIL"));

        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "password123");

        Movie movie = new Movie("Inception", "Christopher Nolan",13 ,148,2010);

        Date date1 = new Date(2023, 10, 1, 19, 0);
        Date date2 = new Date(2023, 10, 2, 19, 0);
        Date date3 = new Date(2023, 10, 3, 19, 0);

        ArrayList<Date> showtimes = new ArrayList<>();
        showtimes.add(date1);
        showtimes.add(date2);
        showtimes.add(date3);

        Venue venue = new Venue("Cinema City",100, "123 Main St");
        ArrayList<String> allergens=new ArrayList<>(); //there are no allergens in these products beause they're really good

        Snacks popcorn = new Snacks("Popcorn", 5.99,true,'M',allergens);
        Snacks nachos = new Snacks("Nachos", 6.99,false,'M',allergens);
        Snacks candy = new Snacks("Candy", 3.99,false,'S',allergens);

        Sodas cola = new Sodas("Pepsi-Zero",false,"Cola","Cola Zero", 2.99,500,true);
        Sodas lemonade = new Sodas("SuperLemon",true,"Lemon","Lemonade", 2.99,330,true);
        Drinks water = new Drinks("Water", 1.99,500,false);


        Map<String,Double> discounts =new HashMap<String,Double>();
        DiscountRecord dr =new DiscountRecord(discounts);
        dr.addDiscount("Student Discount", 0.51);
        dr.addDiscount("Senior Discount", 0.51);
        dr.addDiscount("Child Discount", 0.20);

        Map<Movie, ArrayList<Date>> screenings = new HashMap<>();
        screenings.put(movie, showtimes);
        Offer.setScreenings(screenings);

        ArrayList<Extras> food = new ArrayList<>();
        food.add(popcorn);
        food.add(nachos);
        food.add(candy);
        food.add(cola);
        food.add(lemonade);
        food.add(water);
        Offer.setFood(food);

        System.out.println("Offer created for movie: " + movie.getTitle());
        System.out.println("Showtimes:");
        for (Date date : showtimes) {
            System.out.println(" - " + date);
        }
        System.out.println("Food:");
        for (Extras extra : food) {
            System.out.println(" - " + extra.getName() + ": $" + extra.getPrice());
        }

        try (ExampleResource resource = new ExampleResource()) {
            resource.use();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        //try catch with resources as a custom resource implementing Closeable
        logger.info("Application finished.");
    }
}