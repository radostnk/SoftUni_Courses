package E_ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>(Arrays.stream(scan.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList()));
        String command = scan.nextLine();
        int curPosition = 0;

        while (!command.equals("Love!")) {
            int jump = Integer.parseInt(command.split(" ")[1]);
            curPosition += jump;

            if (curPosition > inputList.size() - 1) {
                curPosition = 0;
            }

            if (inputList.get(curPosition) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", curPosition);
            } else {
                inputList.set(curPosition, inputList.get(curPosition) - 2);

                if (inputList.get(curPosition) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", curPosition);
                }
            }

            command = scan.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", curPosition);

        int counter = 0;

        for (int house : inputList) {
            if (house != 0) {
                counter ++;
            }
        }
        if (counter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}
