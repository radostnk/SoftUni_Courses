package E_IteratorsAndComparators.ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String>{
    private List<String> items;
    private int index;

    public ListyIterator(String... items) {
        this.items = Arrays.asList(items);
        this.index = 0;
    }

    public boolean hasNext() {
        return this.index < items.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    public void print() {
        if (items.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(items.get(index));
        }
    }

    public void printAll() {
        items.forEach(e -> System.out.printf("%s ", e));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < items.size();
            }

            @Override
            public String next() {
                String nextItem = items.get(index);
                this.index++;
                return nextItem;
            }
        };
    }
}

