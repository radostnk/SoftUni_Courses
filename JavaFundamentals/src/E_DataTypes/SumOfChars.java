package E_DataTypes;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int linesNum = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= linesNum; i++) {
            char letter = scan.nextLine().charAt(0);
            sum += letter;
        }
        System.out.println("The sum equals: " + sum);
    }
}