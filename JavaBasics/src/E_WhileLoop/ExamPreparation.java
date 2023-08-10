package E_WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int poorGradesMax = Integer.parseInt(scan.nextLine());
        boolean breakFlag = false;
        int poorGradesNum = 0;
        int tasksCounter = 0;
        String lastTask = "";
        double averageGrade = 0;
        boolean hasFailed = true;

        while (poorGradesMax > poorGradesNum) {
            String input = scan.nextLine();

            if ("Enough".equals(input)) {
                hasFailed = false;
                break;
            } else {
                lastTask = input;
            }

            int grade = Integer.parseInt(scan.nextLine());
            averageGrade += grade;
            tasksCounter ++;

            if (grade <= 4) {
                poorGradesNum ++;
            }
        }
        if (!hasFailed) {
            System.out.printf("Average score: %.2f%n", averageGrade / tasksCounter);
            System.out.printf("Number of problems: %d%n", tasksCounter);
            System.out.printf("Last problem: %s", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesNum);
        }
    }
}