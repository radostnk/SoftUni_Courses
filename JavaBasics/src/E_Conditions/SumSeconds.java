package E_Conditions;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstTime = Integer.parseInt(scan.nextLine());
        int secondTime = Integer.parseInt(scan.nextLine());
        int thirdTime = Integer.parseInt(scan.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int mins = totalTime / 60;
        int secs = totalTime % 60;

        if (secs < 10) {
            System.out.printf("%d:0%d", mins, secs);
        } else {
            System.out.printf("%d:%d", mins, secs);
        }
    }
}
