package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = scan.nextLine();

        while (!command.equals("end")) {

            String[] inputArr = command.split(" ");

            if (inputArr[0].equals("swap")) {
                int firstIndex = Integer.parseInt(inputArr[1]);
                int secondIndex = Integer.parseInt(inputArr[2]);

                int saveValue = numsArr[firstIndex];
                numsArr[firstIndex] = numsArr[secondIndex];
                numsArr[secondIndex] = saveValue;

            } else if (inputArr[0].equals("multiply")) {
                int firstIndex = Integer.parseInt(inputArr[1]);
                int secondIndex = Integer.parseInt(inputArr[2]);

                numsArr[firstIndex] *= numsArr[secondIndex];

            } else if (inputArr[0].equals("decrease")) {
                for (int i = 0; i < numsArr.length; i++) {
                    numsArr[i] = numsArr[i] - 1;
                }
            }
            command = scan.nextLine();
        }
        System.out.println(Arrays.toString(numsArr).replace("[", "").replace("]", ""));
    }
}