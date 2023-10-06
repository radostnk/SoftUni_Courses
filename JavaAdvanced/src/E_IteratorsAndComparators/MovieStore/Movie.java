package E_IteratorsAndComparators.MovieStore;

public class Movie implements Comparable<Movie> {
    private String name;
    private int rating;
    private double price;

    public Movie(String name, int rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        return this.name.compareTo(otherMovie.name);
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %.2f", this.getName(), this.getRating(), this.getPrice());
    }
}
