import java.util.ArrayList;

public class Customer extends User{
    private String accountPasword;

    protected ArrayList<Movie> movies;

    public Customer(String name, String surname, String mail, String password){
        super(name,surname,mail);
        accountPasword=password;
    }


    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void removeMovie(Movie movie){
        movies.remove(movie);
    }

    @Override
    public String getIdentification() {
        return this.getName() + " " + this.getSurname();
    }
}
