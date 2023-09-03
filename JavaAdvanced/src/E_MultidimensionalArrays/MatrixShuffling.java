package E_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] curRow = scan.nextLine().split(" ");
            matrix[i] = curRow;
        }

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("END")) {
            if (isValidCommand(input, rows, cols)) {
                int firstElRow = Integer.parseInt(input[1]);
                int firstElCol = Integer.parseInt(input[2]);
                int secondElRow = Integer.parseInt(input[3]);
                int secondElCol = Integer.parseInt(input[4]);

                String firstEl = matrix[firstElRow][firstElCol];
                String secondEl = matrix[secondElRow][secondElCol];

                matrix[firstElRow][firstElCol] = secondEl;
                matrix[secondElRow][secondElCol] = firstEl;

                for (String[] curRow : matrix) {
                    for (String curEl : curRow) {
                        System.out.printf("%s ", curEl);
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Invalid input!");
            }

            input = scan.nextLine().split(" ");
        }
    }

    public static boolean isValidCommand(String[] input, int rows, int cols) {
        if (!input[0].equals("swap") || input.length != 5) {
            return false;
        }

        for (int i = 1; i < input.length; i++) {
            int curIndex = Integer.parseInt(input[i]);

            if (curIndex < 0) {
                return false;
            }

            if (i % 2 == 0) {
                if (curIndex >= cols) {
                    return false;
                }
            } else {
                if (curIndex >= rows) {
                    return false;
                }
            }
        }
        return true;
    }
}
