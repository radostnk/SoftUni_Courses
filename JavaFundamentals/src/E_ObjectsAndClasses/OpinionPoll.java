package E_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Person {
        private int age;
        private String name;

        public Person(String name, int age) {
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
        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String data = scan.nextLine();
            String inputName = data.split(" ")[0];
            int inputAge = Integer.parseInt(data.split(" ")[1]);

            if (inputAge > 30) {
                Person person = new Person(inputName, inputAge);
                peopleList.add(person);
            }
        }

        for (Person person : peopleList) {
            System.out.printf("%s - %d\n", person.getName(), person.getAge());
        }
    }
}
