public final class MovieValidator {
    private MovieValidator() {
        // Prevent instantiation
    }

    public static boolean isValidTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    public static boolean isValidReleaseYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        return year > 1888 && year <= currentYear; // Movies started around 1888
    }

    public static boolean isValidRating(double rating) {
        return rating >= 0 && rating <= 10;
    }
}
