package Exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tShirtPrice = Double.parseDouble(scan.nextLine());
        double targetSum = Double.parseDouble(scan.nextLine());

        double shortsPrice = 0.75 * tShirtPrice;
        double socksPrice = 0.2 * shortsPrice;
        double shoesPrice = 2 * (tShirtPrice + shortsPrice);
        double price = shoesPrice + tShirtPrice + socksPrice + shortsPrice;
        price -= 0.15 * price;

        if (price >= targetSum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", price);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", targetSum - price);
        }
    }
}