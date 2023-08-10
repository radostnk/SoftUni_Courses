package E_ForLoop;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double washingMachinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double bdMoney = 0;
        double curBdSum = 10.0;
        int toyCounter = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                bdMoney += curBdSum;
                bdMoney -= 1;
                curBdSum += 10;
            } else {
                toyCounter ++;
            }
        }

        bdMoney += toyCounter * toyPrice;
        double diff = Math.abs(bdMoney - washingMachinePrice);

        if (bdMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}