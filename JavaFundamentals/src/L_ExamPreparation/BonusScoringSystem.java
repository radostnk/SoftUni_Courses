package L_ExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scan.nextLine());
        int lecturesCount = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());
        double greatestBonus = 0;
        int mostAttendances = 0;

        for (int i = 1; i <= studentsCount; i++) {
            int attendancesCount = Integer.parseInt(scan.nextLine());
            double bonus = Math.ceil(((double) attendancesCount / lecturesCount) * (5 + additionalBonus));

            if (bonus > greatestBonus) {
                greatestBonus = bonus;
                mostAttendances = attendancesCount;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n", greatestBonus);
        System.out.printf("The student has attended %d lectures.", mostAttendances);
    }
}
