package Advanced.E_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] curRow = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = curRow;
        }

        int[][] newMatrix = new int[3][3];
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int row1col1 = matrix[i][j];
                int row1col2 = matrix[i][j + 1];
                int row1col3 = matrix[i][j + 2];
                int row2col1 = matrix[i + 1][j];
                int row2col2 = matrix[i + 1][j + 1];
                int row2col3 = matrix[i + 1][j + 2];
                int row3col1 = matrix[i + 2][j];
                int row3col2 = matrix[i + 2][j + 1];
                int row3col3 = matrix[i + 2][j + 2];

                int curSum = row1col1 + row1col2 + row1col3 +
                        row2col1 + row2col2 + row2col3 +
                        row3col1 + row3col2 + row3col3;

                if (curSum > sum) {
                    sum = curSum;
                    newMatrix = new int[][] {
                        {row1col1, row1col2, row1col3},
                        {row2col1, row2col2, row2col3},
                        {row3col1, row3col2, row3col3}
                    };
                }
            }
        }
        System.out.printf("Sum = %d\n", sum);
        for (int[] curRow : newMatrix) {
            for (int el : curRow) {
                System.out.printf("%d ", el);
            }
            System.out.println();
        }
    }
}
