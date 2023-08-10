package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numsArr = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String firstNum = String.valueOf(numsArr[0]);

            for (int j = 1; j < numsArr.length; j++) {
                numsArr[j - 1] = numsArr[j];
            }
            numsArr[numsArr.length - 1] = firstNum;
        }
        for (String num: numsArr) {
            System.out.print(num + " ");
        }
    }
}