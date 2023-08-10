package E_BasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupSize = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String weekday = scan.nextLine();
        double pricePerPerson = 0;

        switch (groupType) {
            case "Students":
                if (weekday.equals("Friday")) {
                    pricePerPerson = 8.45;
                } else if (weekday.equals("Saturday")) {
                    pricePerPerson = 9.8;
                } else if (weekday.equals("Sunday")) {
                    pricePerPerson = 10.46;
                }
                if (groupSize >= 30) {
                    pricePerPerson -= pricePerPerson * 0.15;
                }
            break;

            case "Business":
                if (weekday.equals("Friday")) {
                    pricePerPerson = 10.9;
                } else if (weekday.equals("Saturday")) {
                    pricePerPerson = 15.6;
                } else if (weekday.equals("Sunday")) {
                    pricePerPerson = 16;
                }
                if (groupSize >= 100) {
                    groupSize = groupSize - 10;
                }
            break;

            case "Regular":
                if (weekday.equals("Friday")) {
                    pricePerPerson = 15;
                } else if (weekday.equals("Saturday")) {
                    pricePerPerson = 20;
                } else if (weekday.equals("Sunday")) {
                    pricePerPerson = 22.5;
                }
                if (groupSize >= 10 && groupSize <= 20) {
                    pricePerPerson -= pricePerPerson * 0.5;
                }
            break;
        }

        double totalPrice = pricePerPerson * groupSize;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}