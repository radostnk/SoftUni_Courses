package Advanced.E_IteratorsAndComparators.StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Stack implements Iterable<Integer> {
    private List<Integer> myStack;

    public Stack() {
        this.myStack = new ArrayList<>();
    }

    public void push(Integer item) {
        this.myStack.add(item);
    }

    public Integer pop() {
        int itemPopped = myStack.get(myStack.size() - 1);
        myStack.remove(myStack.size() - 1);
        return itemPopped;
    }

    public boolean isNotEmpty() {
        return myStack.size() > 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = myStack.size() - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                int next = myStack.get(index);
                index--;
                return next;
            }
        };
    }
}
