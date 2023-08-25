package E_StacksAndQueues;

import java.util.Scanner;


public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
// 5! -> 1 * 2 * 3 * 4 * 5