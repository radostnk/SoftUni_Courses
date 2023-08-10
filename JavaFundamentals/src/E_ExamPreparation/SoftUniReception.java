package E_ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstStudentsPerHour = Integer.parseInt(scan.nextLine());
        int secondStudentsPerHour = Integer.parseInt(scan.nextLine());
        int thirdStudentsPerHour = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());

        int totalStudentsPerHour = firstStudentsPerHour + secondStudentsPerHour + thirdStudentsPerHour;
        int totalHours = 0;

        while (studentsCount > 0) {
            totalHours ++;

            if (totalHours % 4 == 0) {
                continue;
            }

            studentsCount -= totalStudentsPerHour;
        }
        System.out.printf("Time needed: %dh.", totalHours);
    }
}
