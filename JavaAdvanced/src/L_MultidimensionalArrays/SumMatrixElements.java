package L_MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int sum = 0;

        for (int row = 0; row < rows; row++) {
            String[] rowArr = scan.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                sum += Integer.parseInt(rowArr[col]);
            }
        }

        System.out.printf("%d\n%d\n%d", rows, cols, sum);
    }
}

