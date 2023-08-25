package E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (n > 0) {
            String[] command = scan.nextLine().split(" ");

            switch (command[0]) {
                case "1":
                    int numToPush = Integer.parseInt(command[1]);
                    stack.push(numToPush);
                    break;

                case "2":
                    stack.pop();
                    break;

                case "3":
                    int maxElement = Collections.max(stack);
                    // int maxElement = stack.stream().mapToInt(e -> e).max().getAsInt();
                    // foreach cycle

                    System.out.println(maxElement);
                    break;
            }
            n --;
        }
    }
}
