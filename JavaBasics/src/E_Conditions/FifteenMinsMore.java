package E_Conditions;

import java.util.Scanner;

public class FifteenMinsMore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int mins = Integer.parseInt(scan.nextLine());

        int totalMins = hour * 60 + mins + 15;
        int finalHour = totalMins / 60;
        int finalMins = totalMins % 60;

        if (finalHour == 24) {
            finalHour = 0;
        }

        if (finalMins < 10) {
            System.out.printf("%d:0%d", finalHour, finalMins);
        } else {
            System.out.printf("%d:%d", finalHour, finalMins);
        }
    }
}
