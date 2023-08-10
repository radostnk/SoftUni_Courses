package L_ForLoop;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;


        for (int i = 0; i < n; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            leftSum += curNum;
        }

        for (int i = 0; i < n; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            rightSum += curNum;
        }
        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
