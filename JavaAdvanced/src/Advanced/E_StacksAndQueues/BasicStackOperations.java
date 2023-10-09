package Advanced.E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inputArr = scan.nextLine().split(" ");
        int elementsToPushCount = Integer.parseInt(inputArr[0]);
        int elementsToPopCount = Integer.parseInt(inputArr[1]);
        int elementToCheck = Integer.parseInt(inputArr[2]);

        String[] inputElements = scan.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < elementsToPushCount; i++) {
            int curElement = Integer.parseInt(inputElements[i]);
            stack.push(curElement);
        }

        for (int i = 0; i < elementsToPopCount; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println("0");
        } else if (stack.contains(elementToCheck)) {
            System.out.println("true");
        } else {
//            int smallestNum = Integer.MAX_VALUE;
//
//            for (int num : stack) {
//
//                if (num < smallestNum) {
//                    smallestNum = num;
//                }
//            }
//            int smallestNum = stack.stream().mapToInt(e -> e).min().getAsInt();

            int smallestNum = Collections.min(stack);
            System.out.println(smallestNum);
        }
    }
}
