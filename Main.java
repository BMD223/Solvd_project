import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cashier cashier = new Cashier("Jane","Smith", "jane.smith@example.com",1);

        Admin admin = new Admin("Alice","Johnson", "alice.johnson@example.com",1);

        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "password123");

        Movie movie = new Movie("Inception", "Christopher Nolan",13 ,148);

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

        Discount studentDiscount = new Discount("Student Discount", 0.51);
        Discount seniorDiscount = new Discount("Senior Discount", 0.51);
        Discount childDiscount = new Discount("Child Discount", 0.20);

        Offer offer = new Offer();
        Map<Movie, ArrayList<Date>> screenings = new HashMap<>();
        screenings.put(movie, showtimes);
        offer.setScreenings(screenings);

        ArrayList<Extras> food = new ArrayList<>();
        food.add(popcorn);
        food.add(nachos);
        food.add(candy);
        food.add(cola);
        food.add(lemonade);
        food.add(water);
        offer.setFood(food);

        System.out.println("Offer created for movie: " + movie.getTitle());
        System.out.println("Showtimes:");
        for (Date date : showtimes) {
            System.out.println(" - " + date);
        }
        System.out.println("Food:");
        for (Extras extra : food) {
            System.out.println(" - " + extra.getName() + ": $" + extra.getPrice());
        }
    }
}