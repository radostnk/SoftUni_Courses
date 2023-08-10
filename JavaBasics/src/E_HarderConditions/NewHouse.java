package E_HarderConditions;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowers = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;

        switch (flowers) {
            case "Roses":
                price = 5 * quantity;
                if (quantity > 80) {
                    price -= price * 0.1;
                }
                break;

            case "Dahlias":
                price = quantity * 3.8;
                if (quantity > 90) {
                    price -= price * 0.15;
                }
                break;

            case "Tulips":
                price = quantity * 2.8;
                if (quantity > 80) {
                    price -= price * 0.15;
                }
                break;

            case "Narcissus":
                price = quantity * 3;
                if (quantity < 120) {
                    price += price * 0.15;
                }
                break;

            case "Gladiolus":
                price = quantity * 2.5;
                if (quantity < 80) {
                    price += price * 0.20;
                }
                break;
        }
        double moneyLeft = Math.abs(price - budget);
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
    }
}