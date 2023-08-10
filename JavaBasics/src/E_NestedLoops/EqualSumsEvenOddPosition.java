package E_NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        for (int i = a; i <= b; i++) {
            String curNum = i + "";
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < curNum.length(); j++) {
                Integer.parseInt(curNum);
                int curDigit = Integer.parseInt("" + curNum.charAt(j));

                if (j % 2 == 0) {
                    evenSum += curDigit;
                } else {
                    oddSum += curDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.printf(curNum + " ");
            }
        }
    }
}
