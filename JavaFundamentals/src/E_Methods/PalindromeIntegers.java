package E_Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        while (!command.equals("END")) {
            int n = Integer.parseInt(command);
            System.out.println(isPalindromeInt(n));
            command = scan.nextLine();
        }
    }

    public static boolean isPalindromeInt(int num) {
        String newNum = "";
        int startNum = num;

        while (num > 0) {
            int curDigit = num % 10;
            newNum += curDigit;
            num /= 10;
        }
        return Integer.parseInt(newNum) == startNum;
    }
}
