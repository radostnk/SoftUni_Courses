package E_Conditions;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statistsNum = Integer.parseInt(scan.nextLine());
        double clothingPrice = Double.parseDouble(scan.nextLine());

        double decorPrice = budget * 0.1;
        double finalClothingPrice = statistsNum * clothingPrice;

        if (statistsNum > 150) {
            finalClothingPrice -= finalClothingPrice * 0.1;
        }

        double finalPrice = decorPrice + finalClothingPrice;
        double moneyLeft = Math.abs(finalPrice - budget);

        if (finalPrice <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyLeft);
        }
    }
}