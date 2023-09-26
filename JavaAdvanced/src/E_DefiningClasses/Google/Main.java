package E_DefiningClasses.Google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        HashMap<String, Person> people = new HashMap<>();

        while (!command.equals("End")) {
            String[] data = command.split("\\s+");
            String personName = data[0];
            String dataType = data[1];

            if (!people.containsKey(personName)) {
                people.put(personName, new Person(personName, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
            }

            switch (dataType) {
                case "company":
                    String companyName = data[2];
                    String department = data[3];
                    double salary = Double.parseDouble(data[4]);
                    Company company = new Company(companyName, department, salary);
                    people.get(personName).setCompany(company);
                    break;

                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType = data[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);

                    if (people.get(personName).getPokemons() == null) {
                        people.get(personName).setPokemons(new ArrayList<>());
                    }
                    people.get(personName).getPokemons().add(pokemon);

                    break;

                case "parents":
                    String parentName = data[2];
                    String parentBirthday = data[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    people.get(personName).getParents().add(parent);
                    break;

                case "children":
                    String childName = data[2];
                    String childBirthday = data[3];
                    Child child = new Child(childName, childBirthday);
                    people.get(personName).getChildren().add(child);
                    break;

                case "car":
                    String carModel = data[2];
                    int carSpeed = Integer.parseInt(data[3]);
                    Car car = new Car(carModel, carSpeed);
                    people.get(personName).setCar(car);
                    break;
            }

            command = scan.nextLine();
        }

        System.out.println(people.get(scan.nextLine()).toString());
    }
}
