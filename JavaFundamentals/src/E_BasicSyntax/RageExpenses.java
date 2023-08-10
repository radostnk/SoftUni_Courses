package E_BasicSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int brokenHeadsetsCount = 0;
        int brokenMousesCount = 0;
        int brokenKeyboardsCount = 0;
        int brokenDisplaysCount = 0;

        for (int i = 1; i <= lostGamesCount ; i++) {
            if (i % 2 == 0) {
                brokenHeadsetsCount ++;
            }
            if (i % 3 == 0){
                brokenMousesCount ++;
            }
            if (i % 6 == 0) {
                brokenKeyboardsCount ++;
            }
            if (i % 12 == 0) {
                brokenDisplaysCount ++;
            }
        }
        double totalExpenses = headsetPrice * brokenHeadsetsCount + mousePrice * brokenMousesCount +
                keyboardPrice * brokenKeyboardsCount + displayPrice * brokenDisplaysCount;
        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}