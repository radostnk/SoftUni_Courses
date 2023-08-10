package E_HarderConditions;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String place = "";
        double price = 0;

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.3;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.7;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                place = "Camp";
                price = budget * 0.4;
            } else if (season.equals("winter")) {
                place = "Hotel";
                price = budget * 0.8;
            }

        } else {
            destination = "Europe";
            price = 0.9 * budget;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s", destination);
        System.out.printf("\n%s - %.2f", place, price);
    }
}
