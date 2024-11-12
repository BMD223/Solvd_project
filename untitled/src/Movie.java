public class Movie {
    String Title;
    String Genre;
    int Rating;
    int duration;

    Movie(String title, String genre, int rating, int duration) {
        Title = title;
        Genre = genre;
        Rating = rating;
        this.duration=duration;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
    public String getGenre() {
        return Genre;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getRating() {
        return Rating;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
