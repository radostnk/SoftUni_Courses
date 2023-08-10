package L_WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double moneyInAccount = 0;

        while (!"NoMoreMoney".equals(input)) {
            double currSum = Double.parseDouble(input);

            if (currSum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", currSum);
            moneyInAccount += currSum;

            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", moneyInAccount);
    }
}
