package Advanced.E_IteratorsAndComparators.MovieStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Harry Potter", 9, 10.5);
        Movie movie2 = new Movie("Pretty Little Liars", 7, 12.8);
        Movie movie3 = new Movie("New York City", 4, 9.2);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        movies.sort(new MovieRatingComparator());

        System.out.println("-----------------------");

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        Collections.sort(movies, new MoviePriceComparator().reversed());

        System.out.println("-----------------------");

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        System.out.println("-----------------------");

        Shelf shelf = new Shelf("Harry Potter", "Pretty Little Liars", "New York City", "Revenge");

        for (String movieTitle : shelf) {
            System.out.println(movieTitle);
        }

        System.out.println("-----------------------");

        Iterator<String> shelfIterator = shelf.iterator();
        while (shelfIterator.hasNext()) {
            System.out.println(shelfIterator.next());
        }
    }
}
