package E_BasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int factorialSum = 1;
        int finalSum = 0;

        for (int i = 0; i < number.length(); i++) {
            int curDigit = Integer.parseInt(String.valueOf(number.charAt(i)));
            factorialSum = 1;

            if (curDigit == 0) {
                factorialSum = 0;
            } else {
                for (int j = 1; j <= curDigit; j++) {
                    factorialSum *= j;
                }
                finalSum += factorialSum;
            }
        }
        if (finalSum == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
