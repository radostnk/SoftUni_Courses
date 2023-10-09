package Advanced.E_MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        printMatrix(fillMatrix(matrix));
    }

    public static String[][] fillMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            String[] curArr = matrix[row];

            for (int col = 0; col < curArr.length; col++) {
                char outsideChar = (char) ('a' + row);
                char insideChar = (char) ('a' + row + col);
                matrix[row][col] = "" + outsideChar + insideChar + outsideChar;
            }
        }
        return matrix;
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] curArr : matrix) {
            for (String el : curArr) {
                System.out.printf("%s ", el);
            }
            System.out.println();
        }
    }
}

//3 letters
//Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’,
//Columns + rows define the middle letter:
//o column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
//o column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …