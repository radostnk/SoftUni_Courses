package E_ForLoop;

import java.util.Scanner;

public class ElementsLeftSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            sum += curNum;

            if (curNum > maxNum) {
                maxNum = curNum;
            }
        }
        sum -= maxNum;

        if (maxNum == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            int diff = Math.abs(maxNum - sum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
