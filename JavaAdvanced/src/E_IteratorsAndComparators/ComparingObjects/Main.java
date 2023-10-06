package E_IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {
            String[] peopleData = input.split(" ");

            String name = peopleData[0];
            int age = Integer.parseInt(peopleData[1]);
            String town = peopleData[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scan.nextLine();
        }

        int checkPersonId = Integer.parseInt(scan.nextLine());
        Person personToCompare = people.get(checkPersonId - 1);

        int equalPeople = 0;
        int diffPeople = 0;
        int totalPeople = people.size();

        for (Person p : people) {
            if (personToCompare.compareTo(p) == 0) {
                equalPeople ++;
            } else {
                diffPeople ++;
            }
        }

        if (equalPeople > 1) {
            System.out.printf("%d %d %d", equalPeople, diffPeople, totalPeople);
        } else {
            System.out.println("No matches");
        }
    }
}
