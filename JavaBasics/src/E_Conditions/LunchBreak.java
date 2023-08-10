package E_Conditions;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName = scan.nextLine();
        double episodeLength = Double.parseDouble(scan.nextLine());
        double breakLength = Double.parseDouble(scan.nextLine());

        double lunchBreak = breakLength / 8;
        double restBreak = breakLength / 4;

        double timeLeft = breakLength - lunchBreak - restBreak;
        double finalTimeLeft = Math.abs(timeLeft - episodeLength);

        if (timeLeft >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(finalTimeLeft));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(finalTimeLeft));
        }
    }
}
