package E_ObjectsAndClasses;

import java.util.*;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        List<Person> people = new ArrayList<>();

        while (!command.equals("End")) {
            String name = command.split(" ")[0];
            String id = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            people.add(new Person(name, id, age));

            command = scan.nextLine();
        }

        Collections.sort(people, Comparator.comparingInt(Person::getAge));

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    public static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
        }
    }
}
