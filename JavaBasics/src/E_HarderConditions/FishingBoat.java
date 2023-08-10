package E_HarderConditions;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishermen = Integer.parseInt(scan.nextLine());
        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;

            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;

            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (fishermen <= 6) {
            boatPrice -= boatPrice * 0.1;
        } else if (fishermen <= 11) {
            boatPrice -= boatPrice * 0.15;
        } else {
            boatPrice -= boatPrice * 0.25;
        }

        if ((!"Autumn".equals(season)) && fishermen % 2 == 0) {
            boatPrice -= boatPrice * 0.05;
        }
        double moneyLeft = Math.abs(budget - boatPrice);

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyLeft);
        }
    }
}