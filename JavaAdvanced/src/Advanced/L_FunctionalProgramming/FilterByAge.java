package Advanced.L_FunctionalProgramming;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterByAge {

    public static class Person {
        String name;
        int age;

        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = IntStream.range(0, n)
                .mapToObj(i -> readPerson(scan))
                .collect(Collectors.toList());

        String ageCondition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String printFormat = scan.nextLine();

        filter(ageCondition, age, people).forEach(p -> printFilter(printFormat, p));
    }

    public static Person readPerson(Scanner scan) {
        String[] input = scan.nextLine().split(", ");
        String name = input[0];
        int age = Integer.parseInt(input[1]);
        return new Person(name, age);
    }
    public static List<Person> filter(String ageCondition, int age, List<Person> people) {

        if (ageCondition.equals("younger")) {
            return people.stream()
                    .filter(p -> p.getAge() <= age)
                    .collect(Collectors.toList());
        }
            return people.stream().filter(p -> p.getAge() >= age)
                    .collect(Collectors.toList());

    }

    public static void printFilter(String printFormat, Person p) {
        if (printFormat.equals("name")) {
            System.out.println(p.getName());
        } else if (printFormat.equals("age")) {
            System.out.println(p.getAge());
        } else if (printFormat.equals("name age")) {
            System.out.printf("%s - %d\n", p.getName(), p.getAge());
        }
    }
}
