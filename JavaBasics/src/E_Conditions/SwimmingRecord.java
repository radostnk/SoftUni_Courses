package E_Conditions;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.next());
        double metres = Double.parseDouble(scan.next());
        double secondsPerMetre = Double.parseDouble(scan.next());

        double slowerTimes = Math.floor(metres / 15);
        double ivansTime = metres * secondsPerMetre + slowerTimes * 12.5;

        double timeDifference = Math.abs(ivansTime - record);

        if (ivansTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivansTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeDifference);
        }
    }
}