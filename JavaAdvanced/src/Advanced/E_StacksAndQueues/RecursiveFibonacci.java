package Advanced.E_StacksAndQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static int[] memory;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        memory = new int[n + 1];

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        memory[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memory[n];
    }
}
//5 -> 1 1 2 3 5 8