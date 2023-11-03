package OOP.E_InterfacesAndAbstraction.birthDates;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayList<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Citizen":
                    Birthable citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    birthableList.add(citizen);
                    break;

                case "Pet":
                    Birthable pet = new Pet(tokens[1], tokens[2]);
                    birthableList.add(pet);
                    break;

                case "Robot":
                    //create robot
                    break;
            }

            input = scan.nextLine();
        }

        String year = scan.nextLine();

        for (Birthable obj : birthableList) {
            if (obj.getBirthDate().endsWith(year)) {
                System.out.println(obj.getBirthDate());
            }
        }
    }
}
