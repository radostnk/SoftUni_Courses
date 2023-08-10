package L_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Math.abs(Integer.parseInt(scan.nextLine()));
        int result = evenAndOddSumsMultiplied(num);
        System.out.println(result);
    }
    public static int evenAndOddSumsMultiplied(int num) {
        String numToStr = Integer.toString(num);
        int[] numsArr = Arrays.stream(numToStr.split("")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numsArr.length ; i++) {
            int curNum = numsArr[i];
            if (curNum % 2 == 0) {
                evenSum += curNum;
            } else {
                oddSum += curNum;
            }
        }
        return evenSum * oddSum;
    }
}
