package L_Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());
        printGrade(grade);
    }

    public static void printGrade(double grade) {
        String gradeInWords = "";

        if (grade < 3) {
            gradeInWords = "Fail";
        } else if (grade < 3.5) {
            gradeInWords = "Poor";
        } else if (grade < 4.5) {
            gradeInWords = "Good";
        } else if (grade < 5.5) {
            gradeInWords = "Very good";
        } else {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }
}
