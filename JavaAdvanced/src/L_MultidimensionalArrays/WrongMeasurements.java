package L_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = fillMatrix(scan, size);
        int[] mistakenPosition =  Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int row = mistakenPosition[0];
        int col = mistakenPosition[1];
        int mistakenValue = matrix[row][col];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == mistakenValue) {
                    int curLeft = isInBounds(i, j - 1, matrix) ? matrix[i][j - 1] : 0;
                    int curRight = isInBounds(i, j + 1, matrix) ? matrix[i][j + 1] : 0;
                    int curDown = isInBounds(i + 1, j, matrix) ? matrix[i + 1][j] : 0;
                    int curAbove = isInBounds(i - 1, j, matrix) ? matrix[i - 1][j] : 0;
                    int curSum = curLeft + curAbove + curDown + curRight;
                    matrix[i][j] = curSum;
                }
            }
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.printf("%d ", el);
            }
            System.out.println();
        }
    }

    public static int[][] fillMatrix(Scanner scan, int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            int row[] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = row;
        }
        return matrix;
    }
    public static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[row].length;
    }

}

