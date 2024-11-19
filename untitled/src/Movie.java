public class Movie {
    String Title;
    String Genre;
    protected int Rating;
    int duration;
    int YearMade;

    Movie(String title, String genre, int rating, int duration,int yr) {
        Title = title;
        Genre = genre;
        Rating = rating;
        this.duration=duration;
        YearMade=yr;
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
    public int getYearMade() {
        return YearMade;
    }
    public void setYearMade(int yearMade) {
        YearMade = yearMade;
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
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (Title != null ? Title.hashCode() : 0);
        result = 31 * result + (Genre != null ? Genre.hashCode() : 0);
        result = 31 * result + YearMade;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        if (YearMade != movie.YearMade) return false;
        if (Title != null ? !Title.equals(movie.Title) : movie.Title != null) return false;
        return Genre != null ? Genre.equals(movie.Genre) : movie.Genre == null;
    }
    @Override
    public String toString() {
        return this.Title;
    }
}
