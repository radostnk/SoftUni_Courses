package Advanced.E_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            int[] row = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = row;
        }

        System.out.println(Math.abs(leftDiagonalSum(matrix) - rightDiagonalSum(matrix)));
    }

    public static int leftDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int curNum = matrix[i][i];
            sum += curNum;
        }
        return sum;
    }

    public static int rightDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int col = 0, row = matrix.length - 1; col < matrix.length; col++, row --) {
            int curNum = matrix[row][col];
            sum += curNum;
        }
        return sum;
    }
}
