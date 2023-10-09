package Advanced.E_IteratorsAndComparators.Froggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {

    private List<Integer> rocks;

    public Lake(List<Integer> rocks) {
        this.rocks = rocks;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    public class Frog implements Iterator<Integer> {
        int index = 0;
        boolean firstIterationCompleted = false;

        @Override
        public boolean hasNext() {
            return index < rocks.size();
        }

        @Override
        public Integer next() {
            int indexToReturn = rocks.get(index);
            index += 2;

            if (!firstIterationCompleted && index >= rocks.size()) {
                firstIterationCompleted = true;
                index = 1;
            }
            return indexToReturn;
        }
    }
}
