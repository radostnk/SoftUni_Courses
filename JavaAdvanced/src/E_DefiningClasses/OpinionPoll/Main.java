package E_DefiningClasses.OpinionPoll;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person p = new Person(name, age);
            people.add(p);
        }

        Predicate<Person> filterByAge = p -> p.getAge() > 30;

        people.stream().filter(filterByAge)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.printf("%s - %d\n", p.getName(), p.getAge()));
    }

    //.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
}
