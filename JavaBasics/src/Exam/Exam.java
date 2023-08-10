package Exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentsNum = Integer.parseInt(scan.nextLine());
        int excellentCount = 0;
        int goodCount = 0;
        int poorCount = 0;
        int failedCount = 0;
        double allGrades = 0;

        for (int i = 1; i <= studentsNum; i++) {
            double curGrade = Double.parseDouble(scan.nextLine());
            allGrades += curGrade;

            if (curGrade >= 2 && curGrade < 3) {
                failedCount ++;
            } else if (curGrade < 4) {
                poorCount ++;
            } else if (curGrade < 5) {
                goodCount ++;
            } else if (curGrade >= 5) {
                excellentCount ++;
            }
        }
        double excellentPercentage = excellentCount * 1.0 / studentsNum * 100.0;
        double goodPercentage = goodCount * 1.0 / studentsNum * 100.0;
        double poorPercentage = poorCount * 1.0 / studentsNum * 100.0;
        double failedPercentage = failedCount * 1.0 / studentsNum * 100.0;

        System.out.printf("Top students: %.2f%%%n", excellentPercentage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", goodPercentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", poorPercentage);
        System.out.printf("Fail: %.2f%%%n", failedPercentage);
        System.out.printf("Average: %.2f", allGrades/studentsNum);
    }
}

