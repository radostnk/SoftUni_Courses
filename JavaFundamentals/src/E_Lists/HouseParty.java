package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> guestsList = new ArrayList<>();
        int operationsCount = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= operationsCount; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];

            if (!input[2].equals("not")) {

                if (!guestsList.contains(name)) {
                    guestsList.add(name);
                } else {
                    System.out.println(name + " is already in the list!");
                }

            } else {

                if (guestsList.contains(name)) {
                    guestsList.remove(String.valueOf(name));
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String person : guestsList) {
            System.out.println(person);
        }
    }
}
