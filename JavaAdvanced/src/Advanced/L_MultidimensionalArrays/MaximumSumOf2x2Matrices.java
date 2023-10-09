package Advanced.L_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Matrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sizes = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int cols = sizes[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowArr = scan.nextLine().split(", ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowArr[col]);
            }
        }

        int sum = Integer.MIN_VALUE;
        int[][] newMatrix = new int[2][2];

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int curStart = matrix[row][col];
                int curLeft = matrix[row][col + 1];
                int curEnd = matrix[row + 1][col + 1];
                int curDown = matrix[row + 1][col];
                int curSum = curStart + curLeft + curDown + curEnd;

                if (curSum > sum) {
                    sum = curSum;
                    newMatrix[0][0] = curStart;
                    newMatrix[0][1] = curLeft;
                    newMatrix[1][0] = curDown;
                    newMatrix[1][1] = curEnd;
                }
            }
        }
        for (int[] row : newMatrix) {
            for (int el : row) {
                System.out.printf("%d ", el);
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

