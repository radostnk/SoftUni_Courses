package E_DataTypes;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowballsNum = Integer.parseInt(scan.nextLine());

        double maxValue = 0;
        int maxSnow = 0;;
        int maxTime = 0;
        int maxQuality = 0;

        for (int i = 1; i <= snowballsNum ; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow(((double) snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
                maxQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
