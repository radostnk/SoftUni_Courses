package L_WhileLoop;

import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int myNum = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < myNum) {
            int nextNum = Integer.parseInt(scan.nextLine());
            sum += nextNum;
        }
        System.out.printf("%d", sum);
    }
}