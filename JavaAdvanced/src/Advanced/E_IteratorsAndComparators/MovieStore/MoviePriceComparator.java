package Advanced.E_IteratorsAndComparators.MovieStore;

import java.util.Comparator;

public class MoviePriceComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getPrice(), m2.getPrice());
//        return Double.compare(m2.getPrice(), m1.getPrice()); reversed order
    }

    @Override
    public Comparator<Movie> reversed() {
        return Comparator.super.reversed(); //also reversed order
    }
}
