package Advanced.L_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[size][size];

        for (int rows = 0; rows < size; rows++) {
            int[] curRow = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int cols = 0; cols < size; cols++) {
                matrix[rows][cols] = curRow[cols];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", matrix[i][i]);
        }

        System.out.println();

//        --------With for cycle---------
//        for (int i = 0, j = matrix.length - 1; i < size; i++, j--) {
//            System.out.printf("%d ", matrix[j][i]);
//        }

//        --------With while cycle and isInBoundsMethod---------
        int row = size - 1;
        int col = 0;

        while (isInBounds(row, col, matrix)) {
            System.out.printf("%d ", matrix[row][col]);

            row --;
            col ++;
        }
    }

    public static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && col >= 0 && row < matrix.length && col < matrix[row].length;
    }

    public static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return !isInBounds(row, col, matrix);
    }
}
