package E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        int elToAdd = Integer.parseInt(inputArr[0]);
        int elToRemove = Integer.parseInt(inputArr[1]);
        int elToCheck = Integer.parseInt(inputArr[2]);

        String[] elements = scan.nextLine().split(" ");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elToAdd; i++) {
            int curEl = Integer.parseInt(elements[i]);
            queue.offer(curEl);
        }

        for (int i = 0; i < elToRemove; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println("0");
        } else if (queue.contains(elToCheck)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
