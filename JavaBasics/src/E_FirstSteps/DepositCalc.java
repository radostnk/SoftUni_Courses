package E_FirstSteps;

import java.util.Scanner;

public class DepositCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositedSum = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        double finalSum = depositedSum + months * ((depositedSum * (percentage/100)) / 12);
        System.out.println(finalSum);
    }
}
