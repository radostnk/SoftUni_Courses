package Advanced.ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        ArrayDeque<Integer> menStack = new ArrayDeque<>();
        ArrayDeque<Integer> womenQueue = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(menStack::push);
        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(womenQueue::offer);

        int matchesCount = 0;

        while (!menStack.isEmpty() && !womenQueue.isEmpty()) {
            int curMan = menStack.peek();
            int curWoman = womenQueue.peek();

            if (curMan % 25 == 0) {
                menStack.pop();
                menStack.pop();
                continue;
            }

            if (curWoman % 25 == 0) {
                womenQueue.poll();
                womenQueue.poll();
                continue;
            }

            menStack.pop();
            womenQueue.poll();

            if (curMan == curWoman) {
                matchesCount ++;
            } else {
                menStack.push(curMan - 2);
            }

            menStack.removeIf(el -> el <= 0);
            womenQueue.removeIf(el -> el <= 0);
        }

        System.out.println("Matches: " + matchesCount);
        System.out.println("Males left: " + returnIfLeft(menStack));
        System.out.println("Females left: " + returnIfLeft(womenQueue));
    }

    public static String returnIfLeft(ArrayDeque<Integer> deque) {
        StringBuilder sb = new StringBuilder();

        for (Integer el : deque) {
            sb.append(el).append(", ");
        }

        return deque.isEmpty() ? "none" : sb.delete(sb.length() - 2, sb.length()).toString();
    }
}
