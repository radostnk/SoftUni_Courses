package E_Conditions;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int videocards = Integer.parseInt(scan.nextLine());
        int processors = Integer.parseInt(scan.nextLine());
        int ram = Integer.parseInt(scan.nextLine());

        double videocardsPrice = videocards * 250;
        double processorsPrice = 0.35 * videocardsPrice * processors;
        double ramPrice = 0.1 * videocardsPrice * ram;

        double finalPrice = videocardsPrice + processorsPrice + ramPrice;

        if (videocards > processors) {
            finalPrice -= finalPrice * 0.15;
        }

        double moneyLeft = Math.abs(budget - finalPrice);

        if (finalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", moneyLeft);
        }
    }
}