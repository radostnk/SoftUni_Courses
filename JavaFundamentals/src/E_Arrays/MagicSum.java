package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int targetSum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numsArr.length; i++) {
            int firstNum = numsArr[i];
            int secondNum = 0;

            for (int j = i + 1; j < numsArr.length; j++) {
                secondNum = numsArr[j];

                if (firstNum + secondNum == targetSum) {
                    System.out.println(firstNum + " " + secondNum);
                }
            }
        }
    }
}
