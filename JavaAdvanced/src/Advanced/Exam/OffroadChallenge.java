package Advanced.Exam;

import java.util.*;
import java.util.stream.Collectors;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> initialFuelStack = new ArrayDeque<>();
        ArrayDeque<Integer> additionalConsumptionIndexQueue = new ArrayDeque<>();
        ArrayDeque<Integer> fuelNeeded = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(initialFuelStack::push);

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(additionalConsumptionIndexQueue::offer);

        Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(fuelNeeded::offer);

        int altitude = 0;
        int altitudesTotal = fuelNeeded.size();
        ArrayList<Integer> reachedAltitudes = new ArrayList<>();

        // && !additionalConsumptionIndexQueue.isEmpty() && !fuelNeeded.isEmpty()
        while (!initialFuelStack.isEmpty()) {
            int curFuel = initialFuelStack.pop();
            int curIndex = additionalConsumptionIndexQueue.poll();
            int curNeeded = fuelNeeded.poll();

            int result = curFuel - curIndex;
            altitude ++;

            if (result < curNeeded) {
                System.out.printf("John did not reach: Altitude %d\n", altitude);
                break;
            } else {
                reachedAltitudes.add(altitude);
                System.out.printf("John has reached: Altitude %d\n", altitude);
            }
        }

        if (reachedAltitudes.isEmpty()) {
            System.out.printf("John failed to reach the top.\n" +
                            "John didn't reach any altitude.\n");
        } else if (reachedAltitudes.size() == altitudesTotal) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.println("John failed to reach the top.");
            System.out.print("Reached altitudes: ");

            for (int i = 1; i < altitude; i++) {
                System.out.printf("Altitude %d", i);
                if (i != altitude - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}