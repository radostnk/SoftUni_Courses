package L_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // String input = scanner.nextLine();
        // int[] numbersArr = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        String[] inputArr = scan.nextLine().split(" ");
        int[] numsArr = new int[inputArr.length];

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i] = Integer.parseInt(inputArr[i]);
        }

        int[] condensedArr = new int[numsArr.length - 1];

        for (int i = 0; i < numsArr.length; i++) {

            if (numsArr.length == 1) {
                break;
            }

            if (i == numsArr.length - 1) {
                int[] condensedNewArr = new int[condensedArr.length - 1];
                i = -1;
                numsArr = condensedArr;
                condensedArr = condensedNewArr;

            } else {
                condensedArr[i] = numsArr[i] + numsArr[i + 1];
            }
        }
        System.out.println(numsArr[0]);
    }
}
