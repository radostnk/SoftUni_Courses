package E_Generics.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> elements;

    public MyList() {
        elements = new ArrayList<>();
    }

    public List<T> getValues() {
        return elements;
    }

    public void setValues(List<T> elements) {
        this.elements = elements;
    }

    public T get(int index) {
        return elements.get(index);
    }

    public long size() {
        return elements.size();
    }

    public void add(T el) {
        elements.add(el);
    }

    public T remove(int index) {
        return elements.remove(index);
    }

    public boolean contains(T el) {
        return elements.contains(el);
    }

    public void swap(int indexA, int indexB) {
        Collections.swap(elements, indexA, indexB);
    }

    public long countGreaterThan(T el) {
        return elements.stream().filter(listEl -> listEl.compareTo(el) > 0).count();
    }

    public T getMax() {
        return elements.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return elements.stream().max(Comparator.reverseOrder()).get();
    }

    public void print() {
        for (T el : elements) {
            System.out.println(el);
        }
    }
}