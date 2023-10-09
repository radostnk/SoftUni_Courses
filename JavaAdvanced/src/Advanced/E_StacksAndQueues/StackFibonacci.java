package Advanced.E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.nextLine());

        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(0L);
        stack.push(1L);

        if (n < 2) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < n; i++) {
            long num2 = stack.pop();
            long num1 = stack.pop();
            stack.push(num2);
            stack.push(num1 + num2);
        }

        System.out.println(stack.pop());
    }
}
