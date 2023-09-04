package L_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashSet<String> numbersSet = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String direction = input.split(", ")[0];
            String number = input.split(", ")[1];

            if (direction.equals("IN")) {
                numbersSet.add(number);
            } else if (direction.equals("OUT")) {
                numbersSet.remove(number);
            }

            input = scan.nextLine();
        }

        if (numbersSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            numbersSet.forEach(num -> System.out.println(num));
        }
    }
}
