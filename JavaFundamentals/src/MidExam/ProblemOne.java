package MidExam;

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int studentsNum = Integer.parseInt(scan.nextLine());
        double flourPrice = Double.parseDouble(scan.nextLine());
        double eggPrice = Double.parseDouble(scan.nextLine());
        double apronPrice = Double.parseDouble(scan.nextLine());

        int freeFloursNum = (int) Math.floor(studentsNum / 5);

        double apronTotalPrice = apronPrice * Math.ceil(studentsNum * 0.2 + studentsNum);
        double flourTotalPrice = (studentsNum - freeFloursNum) * flourPrice;
        double totalPrice = 10 * eggPrice * studentsNum + apronTotalPrice + flourTotalPrice;

        if (totalPrice <= budget) {
            System.out.printf("Items purchased for %.2f$.", totalPrice);
        } else {
            System.out.printf("%.2f$ more needed.", totalPrice - budget);
        }
    }
}
//5th flour free
//20% more apron ceil
// one student -> 1 flour, 10 eggs, 1 apron