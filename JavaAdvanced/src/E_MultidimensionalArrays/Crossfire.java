package E_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sizes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int cols = sizes[1];
        ArrayList<ArrayList<Integer>> matrix = fillTheMatrix(rows, cols);
        String input = scan.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[] toDestroy = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowToDestroy = toDestroy[0];
            int colToDestroy = toDestroy[1];
            int radiusToDestroy = toDestroy[2];

            int rowStart = rowToDestroy - radiusToDestroy;
            int rowEnd = rowToDestroy + radiusToDestroy;
            int colStart = colToDestroy - radiusToDestroy;
            int colEnd = colToDestroy + radiusToDestroy;

            for (int curRow = rowStart; curRow <= rowEnd; curRow++) {
                if (isInBounds(matrix, curRow, colToDestroy) && curRow != rowToDestroy) {
                    matrix.get(curRow).remove(colToDestroy);
                }
            }

            for (int curCol = colEnd; curCol >= colStart; curCol--) {
                if (isInBounds(matrix, rowToDestroy, curCol)) {
                    matrix.get(rowToDestroy).remove(curCol);
                }
            }

            matrix.removeIf(List::isEmpty);
            input = scan.nextLine();
        }

        for(List<Integer> integers : matrix){
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> fillTheMatrix(int rows, int cols) {
        int counter = 1;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());

            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(counter++);
            }
        }
        return matrix;
    }

    public static boolean isInBounds(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
