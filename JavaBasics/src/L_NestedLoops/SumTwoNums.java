package L_NestedLoops;

import java.util.Scanner;

public class SumTwoNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int countCombos = 0;
        boolean isFound = false;

        for (int i = a; i <= b ; i++) {
            if (isFound) {
                break;
            }
            for (int j = a; j <= b ; j++) {
                countCombos ++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombos, i, j, magicNum);
                    isFound = true;
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", countCombos, magicNum);
        }
    }
}