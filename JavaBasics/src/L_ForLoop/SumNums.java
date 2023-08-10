package L_ForLoop;

import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            sum += curNum;
        }
        System.out.println(sum);
    }
}
