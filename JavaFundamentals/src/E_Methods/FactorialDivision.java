package E_Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        long factA = findFactorial(a);
        long factB = findFactorial(b);

        float result = (float) factA / factB;
        System.out.printf("%.2f", result);
    }

    public static long findFactorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
