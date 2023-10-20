package Advanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();

        Arrays.stream(scan.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .forEach(liliesStack::push);

        Arrays.stream(scan.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .forEach(rosesQueue::offer);

        int leftovers = 0;
        int wreathsNum = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int curRose = rosesQueue.poll();
            int curLily = liliesStack.pop();
            int sum = curLily + curRose;

            while (sum > 15) {
                curLily -= 2;
                sum = curLily + curRose;
            }

            if (sum == 15) {
                wreathsNum ++;

            } else if (sum < 15) {
                leftovers += sum;

            }
        }

        while (leftovers >= 15) {
           leftovers -= 15;
           wreathsNum ++;
        }

        if (wreathsNum >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!\n", wreathsNum);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!\n", 5-wreathsNum);
        }
    }
}