package L_NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine();;

        while (!destination.equals("End")) {
            double moneyNeeded = Double.parseDouble(scan.nextLine());
            double moneyGathered = 0;

            while (moneyNeeded > moneyGathered) {
                double curSum = Double.parseDouble(scan.nextLine());
                moneyGathered += curSum;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scan.nextLine();
        }
    }
}