package Exam;

import java.util.Scanner;

public class StantasHoliday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scan.nextLine());
        int nightsToStay = daysToStay - 1;
        String roomType = scan.nextLine();
        String opinion = scan.nextLine();
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18 * nightsToStay;
                break;

            case "apartment":
                price = 25 * nightsToStay;

                if (daysToStay < 10) {
                    price -= 0.3 * price;
                } else if (daysToStay < 16) {
                    price -= 0.35 * price;
                } else {
                    price -= 0.5 * price;
                }
                break;

            case "president apartment":
                price = 35 * nightsToStay;

                if (daysToStay < 10) {
                    price -= 0.1 * price;
                } else if (daysToStay < 16) {
                    price -= 0.15 * price;
                } else {
                    price -= 0.2 * price;
                }
                break;
        }
        if (opinion.equals("positive")) {
            price += 0.25 * price;
        } else if (opinion.equals("negative")) {
            price -= 0.1 * price;
        }
        System.out.printf("%.2f", price);
    }
}
