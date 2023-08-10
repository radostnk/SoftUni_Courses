package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> passengersPerWagon = new ArrayList<>(Arrays.stream(scan.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        int maxCapacity = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();

        while(!command.equals("end")) {
            String[] input = command.split(" ");

            if (input[0].equals("Add")) {
                passengersPerWagon.add(Integer.parseInt(input[1]));
            } else {
                int peopleMore = Integer.parseInt(input[0]);

                for (int i = 0; i < passengersPerWagon.size(); i++) {
                    if (passengersPerWagon.get(i) + peopleMore <= maxCapacity) {
                        passengersPerWagon.add(i, peopleMore + passengersPerWagon.get(i));
                        passengersPerWagon.remove(i + 1);
                        break;
                    }
                }
            }

            command = scan.nextLine();
        }
        System.out.print(passengersPerWagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
