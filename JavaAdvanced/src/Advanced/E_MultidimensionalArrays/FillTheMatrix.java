package Advanced.E_MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] matrix = new int[size][size];

        if (method.equals("A")) {
            printMatrix(methodA(matrix));
        } else {
            printMatrix(methodB(matrix));
        }
    }

    public static int[][] methodA(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter;
                counter ++;
            }
        }
        return matrix;
    }

    public static int[][] methodB(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] curArr : matrix) {
            for (int el : curArr) {
                System.out.printf("%d ", el);
            }
            System.out.println();
        }
    }

    //just for me
    public static int[][] methodC(int[][] matrix) {
        for (int[] curArr : matrix) {
            for (int i = 0; i < curArr.length; i++) {
                curArr[i] = i;
            }
        }
        return matrix;
    }
}
