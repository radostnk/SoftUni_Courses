package E_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArr = scan.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String el : inputArr) {
            int elAsNum = Integer.parseInt(el);
            stack.push(elAsNum);
        }

        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }
    }
}
