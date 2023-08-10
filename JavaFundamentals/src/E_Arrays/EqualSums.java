package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numsArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean foundNum = false;

        for (int i = 0; i < numsArr.length; i++) {
            int curNum = numsArr[i];
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i + 1; j < numsArr.length; j++) {
                rightSum += numsArr[j];
            }

            for (int k = 0; k < i; k++) {
                leftSum += numsArr[k];
            }

            if (leftSum == rightSum) {
                foundNum = true;
                System.out.println(i);
            }
        }
        if (!foundNum) {
            System.out.println("no");
        }
    }
}
