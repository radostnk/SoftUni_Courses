package Advanced.E_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] curRow = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = curRow;
        }

        int row = rows - 1;
        int col = cols - 1;

        while (row != -1){
            int r = row;
            int c = col;

            while (c < cols && r >= 0){
                //first is printing and then values are decreased.
                System.out.print(matrix[r--][c++] + " ");
            }

            System.out.println();
            col--;

            if(col == -1){
                col = 0;
                row--;
            }
        }
    }
}
