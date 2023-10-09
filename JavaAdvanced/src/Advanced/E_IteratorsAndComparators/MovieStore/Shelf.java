package Advanced.E_IteratorsAndComparators.MovieStore;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Shelf implements Iterable<String>{
    private List<String> movieTitles;

    public Shelf(String... movieTitles) {
        this.movieTitles = Arrays.asList(movieTitles);
    }

    @Override
    public Iterator<String> iterator() {
        return new ShelfIterator();

//        return new Iterator<String>() {
//            int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index < movieTitles.size();
//            }
//
//            @Override
//            public String next() {
//                return movieTitles.get(index++);
//            }
//        };
    }

    public class ShelfIterator implements Iterator<String>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < movieTitles.size();
        }

        @Override
        public String next() {
            return movieTitles.get(index++);
        }
    }
}
