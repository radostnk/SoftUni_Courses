package E_IteratorsAndComparators.StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getName().length() == p2.getName().length()) {
            char p1FirstLetter = p1.getName().toLowerCase().charAt(0);
            char p2FirstLetter = p2.getName().toLowerCase().charAt(0);

            return Character.compare(p1FirstLetter, p2FirstLetter);
        } else {
            return Integer.compare(p1.getName().length(), p2.getName().length());
        }
    }
}
