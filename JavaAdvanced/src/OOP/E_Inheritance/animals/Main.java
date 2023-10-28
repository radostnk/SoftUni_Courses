package OOP.E_Inheritance.animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<Animal> animals = new ArrayList<>();

        while (!input.equals("Beast!")) {
            String animalType = input;
            String[] animalTokens = scan.nextLine().split(" ");
            String name = animalTokens[0];
            int age = Integer.parseInt(animalTokens[1]);
            String gender = animalTokens[2];

            try {
                switch (animalType) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                        break;

                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                        break;

                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                        break;

                    case "Kitten":
                        Kitten kitten = new Kitten(name, age, gender);
                        animals.add(kitten);
                        break;

                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age, gender);
                        animals.add(tomcat);
                        break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            input = scan.nextLine();
        }

        animals.forEach(System.out::println);
    }
}
