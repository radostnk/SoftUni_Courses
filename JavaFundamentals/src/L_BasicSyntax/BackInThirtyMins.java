package L_BasicSyntax;

import java.util.Scanner;

public class BackInThirtyMins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int mins = Integer.parseInt(scan.nextLine());

        int minsTotal = hours * 60 + mins + 30;

        int hoursFinal = minsTotal / 60;
        int minsFinal = minsTotal % 60;

        if (hoursFinal == 24) {
            hoursFinal = 0;
        }

        if (minsFinal < 10) {
            System.out.printf("%d:0%d", hoursFinal, minsFinal);
        } else {
            System.out.printf("%d:%d", hoursFinal, minsFinal);
        }
    }
}
