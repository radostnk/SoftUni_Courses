package L_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        System.out.println(df.format(calculate(a, operator, b)));
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                result = (double) a / b;
                break;
        }
        return result;
    }
}
