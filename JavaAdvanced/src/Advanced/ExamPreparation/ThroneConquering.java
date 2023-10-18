package Advanced.ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ThroneConquering {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        char[][] matrix = fillTheMatrix(scan, n);
        boolean helenFound = false;

        while (energy > 0) {
            String[] input = scan.nextLine().split(" ");
            String movement = input[0];
            int enemyRow = Integer.parseInt(input[1]);
            int enemyCol = Integer.parseInt(input[2]);

            matrix[enemyRow][enemyCol] = 'S';

            int[] oldPosition = getPositon(matrix, 'P');
            int[] newPosition = getPositon(matrix, 'P');

            switch (movement) {
                case "up":
                    newPosition[0] -= 1;
                    break;

                case "down":
                    newPosition[0] += 1;
                    break;

                case "left":
                    newPosition[1] -= 1;
                    break;

                case "right":
                    newPosition[1] += 1;
                    break;
            }

            if (!isInBounds(matrix, newPosition[0], newPosition[1])) {
                energy --;

                if (energy <= 0) {
                    matrix[oldPosition[0]][oldPosition[1]] = 'X';
                    break;
                } else {
                    continue;
                }
            }

            if (matrix[newPosition[0]][newPosition[1]] == 'H') {
                helenFound = true;

                matrix[oldPosition[0]][oldPosition[1]] = '-';
                matrix[newPosition[0]][newPosition[1]] = '-';

                energy --;
                break;

            } else {

                if (matrix[newPosition[0]][newPosition[1]] == 'S') {
                    energy -= 3;

                } else {
                    energy--;
                }

                if (energy <= 0) {
                    matrix[oldPosition[0]][oldPosition[1]] = '-';
                    matrix[newPosition[0]][newPosition[1]] = 'X';
                    break;
                } else {
                    matrix[oldPosition[0]][oldPosition[1]] = '-';
                    matrix[newPosition[0]][newPosition[1]] = 'P';
                }
            }
        }

        if (!helenFound) {
            int[] lastPosition = getPositon(matrix, 'X');
            System.out.printf("Paris died at %d;%d.\n", lastPosition[0], lastPosition[1]);
        } else {
            System.out.println("Paris has successfully abducted Helen! Energy left: " + energy);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]).replaceAll("[\\[\\]\\s,]+", ""));
        }
    }

    private static boolean isInBounds(char[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static int[] getPositon(char[][] matrix, char character) {
        int[] position = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == character) {
                    position[0] = i;
                    position[1] = j;
                    break;
                }
            }
        }
        return position;
    }

    private static char[][] fillTheMatrix(Scanner scan, int n) {
        char[][] matrix = new char[n][];

        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }
        return matrix;
    }
}
