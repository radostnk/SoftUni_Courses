package L_ForLoop;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            if (curNum > maxNum) {
                maxNum = curNum;
            }
            if (curNum < minNum) {
                minNum = curNum;
            }
        }
        System.out.printf("Max number: %d", maxNum);
        System.out.printf("\nMin number: %d", minNum);
    }
}
