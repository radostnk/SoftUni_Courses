package E_Conditions;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double price = puzzles * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;

        if (puzzles + dolls + bears + minions + trucks >= 50) {
            price -= price * 0.25;
        }

        price -= price * 0.1;
        double moneyLeft = Math.abs(tripPrice - price);

        if (price >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }
    }
}