package L_MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());

        char[][] firstmatrix = fillMatrix(scan, rows, cols);
        char[][] secondmatrix = fillMatrix(scan, rows, cols);
        char[][] newMatrix = intersect(firstmatrix,secondmatrix, rows, cols);
        printMatrix(newMatrix);

    }

    public static char[][] fillMatrix(Scanner scan, int rows, int cols) {
        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String input = scan.nextLine();
            input = input.replaceAll(" ", "");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.charAt(j);
            }
        }
        return matrix;
    }

    public static char[][] intersect(char[][] firstMatrix, char[][] secondMatrix, int rows, int cols) {
        char[][] newMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    newMatrix[i][j] = '*';
                } else {
                    newMatrix[i][j] = firstMatrix[i][j];
                }
            }
        }
        return newMatrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char el : row) {
                System.out.printf("%c ", el);
            }
            System.out.println();
        }
    }
}

