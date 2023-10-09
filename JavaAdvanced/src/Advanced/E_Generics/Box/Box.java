package Advanced.E_Generics.Box;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T e) {
        this.values.add(e);
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        values.forEach(el -> sb.append(String.format("%s: %s\n", el.getClass().getName(), el)));
        return sb.toString();
    }

    public void swap(int indexA, int indexB) {
        T a = values.get(indexA);
        values.set(indexA, values.get(indexB));
        values.set(indexB, a);
//        Collections.swap(values, indexA, indexB);
    }

    public long countLargerElements(T comparator) {
        return values.stream().filter(el -> el.compareTo(comparator) > 0).count();
    }
}
