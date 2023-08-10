package E_Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            if (divisibleByEight(i) && holdsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleByEight(int num) {
        int sum = 0;

        while (num > 0) {

            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return sum % 8 == 0;
    }

    public static boolean holdsOddDigit(int num) {
        boolean hasOdd = false;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                hasOdd = true;
                break;
            }
            num /= 10;
        }
        return hasOdd;
    }
}
