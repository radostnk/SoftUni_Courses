package L_WhileLoop;

import java.util.Scanner;

public class MinNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minNum = Integer.MAX_VALUE;
        String input = scan.nextLine();

        while (!"Stop".equals(input)) {
            int curNum = Integer.parseInt(input);

            if (curNum < minNum) {
                minNum = curNum;
            }
            input = scan.nextLine();
        }
        System.out.printf("%d",minNum);
    }
}
