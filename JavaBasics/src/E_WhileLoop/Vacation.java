package E_WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        int daysSpending = 0;
        int daysTotal = 0;
        boolean breakFlag = false;

        while (daysSpending < 5) {
            String action = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            daysTotal ++;

            if (action.equals("spend")) {
                daysSpending ++;
                budget -= sum;

                if (budget <= 0) {
                    budget = 0;
                }

            } else if (action.equals("save")) {
                daysSpending = 0;
                budget += sum;
            }
            if (budget >= vacationPrice) {
                breakFlag = true;
                System.out.printf("You saved the money for %d days.", daysTotal);
                break;
            }
        }
        if (!breakFlag) {
            System.out.printf("You can't save the money.%n%d", daysTotal);
        }
    }
}