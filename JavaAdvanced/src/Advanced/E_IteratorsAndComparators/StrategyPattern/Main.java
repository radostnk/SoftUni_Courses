package Advanced.E_IteratorsAndComparators.StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        TreeSet<Person> peopleByName = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleByAge = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person p = new Person(name, age);
            peopleByAge.add(p);
            peopleByName.add(p);
        }

        peopleByName.forEach(e -> System.out.println(e.toString()));
        peopleByAge.forEach(e -> System.out.println(e.toString()));
    }
}
