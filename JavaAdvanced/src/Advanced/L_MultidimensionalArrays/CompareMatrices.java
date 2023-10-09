package Advanced.L_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] firstMatrix = fillMatrix(scan);
        int[][] secondMatrix = fillMatrix(scan);

        String result = compareMatrices(firstMatrix, secondMatrix) ? "equal" : "not equal";
        System.out.println(result);
    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int rows = 0; rows < firstMatrix.length; rows++) {
            if (firstMatrix[rows].length != secondMatrix[rows].length) {
                return false;
            }

            for (int cols = 0; cols < firstMatrix[rows].length; cols++) {
                if (firstMatrix[rows][cols] != secondMatrix[rows][cols]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] fillMatrix(Scanner scan) {
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] curRow = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = curRow;
        }
        return matrix;
    }
}
