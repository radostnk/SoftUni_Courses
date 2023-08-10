package L_WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int classs = 1;
        int badGrades = 0;
        boolean breakFlag = false;
        double average = 0;

        while (classs <= 12) {
            double curGrade = Double.parseDouble(scan.nextLine());

            if (curGrade < 4) {
                badGrades ++;
            } else {
                classs ++;
            }
            if (badGrades >= 2) {
                System.out.printf("%s has been excluded at %d grade", name, classs);
                breakFlag = true;
                break;
            }
            average += curGrade;
        }
        if (!breakFlag) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average/12);
        }
    }
}
