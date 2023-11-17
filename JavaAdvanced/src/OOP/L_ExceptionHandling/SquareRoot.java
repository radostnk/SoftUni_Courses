package OOP.L_ExceptionHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        try {
            double result = sqrt(input);
            System.out.printf("%.2f\n", result);

        } catch (IllegalArgumentException ignored) {
            System.out.println("Invalid");
        }

        System.out.println("Goodbye");
    }

    private static double sqrt(String input) {
        int num = Integer.parseInt(input);

        if (num < 0) {
            throw new IllegalArgumentException("The number is negative.");
        }

        return Math.sqrt(num);
    }
}
