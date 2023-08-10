package E_WhileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine());
        double sumInCoins = Math.round(sum * 100);
        int coins = 0;

        while (sumInCoins > 0) {
            if (sumInCoins >= 200) {
                sumInCoins -= 200;
                coins ++;
            } else if (sumInCoins >= 100) {
                sumInCoins -= 100;
                coins ++;
            } else if (sumInCoins >= 50) {
                sumInCoins -= 50;
                coins ++;
            } else if (sumInCoins >= 20) {
                sumInCoins -= 20;
                coins++;
            } else if (sumInCoins >= 10) {
                sumInCoins -= 10;
                coins ++;
            } else if (sumInCoins >= 5) {
                sumInCoins -= 5;
                coins ++;
            } else if (sumInCoins >= 2) {
                sumInCoins -= 2;
                coins ++;
            } else if (sumInCoins >= 1) {
                sumInCoins -= 1;
                coins ++;
            }
        }
        System.out.printf(String.valueOf(coins));
    }
}
