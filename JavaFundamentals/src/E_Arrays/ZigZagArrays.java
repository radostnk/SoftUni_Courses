package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] zigArr = new int[n];
        int[] zagArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] curLine = scan.nextLine().split(" ");

            if (i % 2 == 0) {
                zigArr[i] = Integer.parseInt(curLine[0]);
                zagArr[i] = Integer.parseInt(curLine[1]);
            } else {
                zagArr[i] = Integer.parseInt(curLine[0]);
                zigArr[i] = Integer.parseInt(curLine[1]);
            }
        }

        for (int j : zigArr) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : zagArr) {
            System.out.print(j + " ");
        }
    }
}
