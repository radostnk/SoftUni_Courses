package E_WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stepsGoal = 10000;
        int stepsTotal = 0;
        boolean breakFlag = false;

        while (stepsTotal < stepsGoal) {
            String command = scan.nextLine();

            if (command.equals("Going home")) {
                int lastSteps = Integer.parseInt(scan.nextLine());
                stepsTotal += lastSteps;

                if (stepsTotal >= stepsGoal) {
                    breakFlag = false;
                    break;
                } else {
                    breakFlag = true;
                    System.out.printf("%d more steps to reach goal.", stepsGoal - stepsTotal);
                    break;
                }
            } else {
                int curSteps = Integer.parseInt(command);
                stepsTotal += curSteps;
            }
        }
        if (!breakFlag) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", stepsTotal - stepsGoal);
        }
    }
}