package L_Arrays;

import java.util.Scanner;

public class PrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] numsArr = new int[n];

        for (int i = 0; i < numsArr.length; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            numsArr[i] = curNum;
        }

        for (int i = numsArr.length - 1; i >= 0 ; i--) {
            System.out.print(numsArr[i] + " ");
        }
    }
}
