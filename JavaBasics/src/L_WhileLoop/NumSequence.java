package L_WhileLoop;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int curNum = 1;

        while (curNum <= n) {
            System.out.printf("%d%n", curNum);
            curNum = curNum * 2 + 1;
        }
    }
}