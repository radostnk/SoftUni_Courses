package Advanced.E_Generics.CustomList;

public class Sorter {

    public static <T extends Comparable<T>> void sort(MyList<T> elements) {
        for (int i = 0; i < elements.size(); i++) {
            T curEl = elements.get(i);

            for (int j = i + 1; j < elements.size(); j++) {
                if (curEl.compareTo(elements.get(j)) > 0) {
                    elements.swap(i, j);
                }
            }
        }
    }
}
