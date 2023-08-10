package Exam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String first= "";
        String second= "";
        String third = "";
        int result = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (i == 2) {
                first = String.valueOf(input.charAt(i));
            } else if (i == 1) {
                second = String.valueOf(input.charAt(i));
            } else {
                third = String.valueOf(input.charAt(i));
            }
        }

        int firstDigit = Integer.parseInt(first);
        int secondDigit = Integer.parseInt(second);
        int thirdDigit = Integer.parseInt(third);


        for (int a = 1; a <= firstDigit; a++) {
            for (int b = 1; b <= secondDigit; b++) {
                for (int c = 1; c <= thirdDigit; c++) {
                    result = a * b * c;
                    System.out.printf("%d * %d * %d = %d;%n", a, b, c, result);
                }
            }
        }
    }
}
