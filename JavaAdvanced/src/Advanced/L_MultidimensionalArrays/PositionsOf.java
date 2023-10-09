package Advanced.L_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] curRow = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = curRow;
        }

        int num = Integer.parseInt(scan.nextLine());
        boolean foundNum = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == num) {
                    foundNum = true;
                    System.out.printf("%d %d\n", i, j);
                }
            }
        }

        if (!foundNum) {
            System.out.println("not found");
        }

    }
}

