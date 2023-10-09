package Advanced.E_IteratorsAndComparators.MovieStore;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return m1.getRating() - m2.getRating();
//        return Integer.compare(m1.getRating(), m2.getRating());
    }
}
