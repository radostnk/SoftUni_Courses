package L_WhileLoop;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNum = Integer.MIN_VALUE;
        String input = scan.nextLine();

        while (!"Stop".equals(input)) {
            int curNum = Integer.parseInt(input);

            if (curNum > maxNum) {
                maxNum = curNum;
            }
            input = scan.nextLine();
        }
        System.out.printf("%d",maxNum);
    }
}
