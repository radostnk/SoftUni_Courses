package E_HarderConditions;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysToStay = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String opinions = scan.nextLine();
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = 18 * (daysToStay - 1);
                break;

            case "apartment":
                price = 25 * (daysToStay - 1);

                if (daysToStay < 10) {
                    price -= price * 0.3;
                }else if (daysToStay < 15) {
                    price -= price * 0.35;
                } else {
                    price -= price * 0.5;
                }

                break;

            case "president apartment":
                price = 35 * (daysToStay - 1);

                if (daysToStay < 10) {
                    price -= price * 0.1;
                }else if (daysToStay < 15) {
                    price -= price * 0.15;
                } else {
                    price -= price * 0.2;
                }

                break;
        }
        if (opinions.equals("positive")) {
            price += price * 0.25;
        } else if (opinions.equals("negative")) {
            price -= price * 0.1;
        }
        System.out.printf("%.2f", price);
    }
}
