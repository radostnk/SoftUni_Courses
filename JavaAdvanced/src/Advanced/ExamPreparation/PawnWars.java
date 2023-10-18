package Advanced.ExamPreparation;

import java.util.HashMap;
import java.util.Scanner;

public class PawnWars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<Integer, Integer> rowValues = fillRowValues();
        HashMap<Integer, Character> colValues = fillColValues();

        char[][] boardMatrix = fillTheMatrix(scan);
        char b = 'b';
        char w = 'w';

        int[] wPosition = getPositon(boardMatrix, w);
        int[] bPosition = getPositon(boardMatrix, b);

        boolean wIsWinner = false;
        boolean bIsWinner = false;

        while (isInBounds(wPosition[0] - 1, wPosition[1]) && isInBounds(bPosition[0] + 1, bPosition[1])) {
            if (wPosition[0] == bPosition[0] + 1) {
                if ((wPosition[1] == bPosition[1] + 1) || (wPosition[1] == bPosition[1] - 1)) {
                    wIsWinner = true;
                    break;
                }
            }

            movePawn(boardMatrix, w);
            wPosition = getPositon(boardMatrix, w);

            if (bPosition[0] == wPosition[0] - 1) {
                if ((bPosition[1] == wPosition[1] + 1) || (bPosition[1] == wPosition[1] - 1)) {
                    bIsWinner = true;
                    break;
                }
            }

            movePawn(boardMatrix, b);
            bPosition = getPositon(boardMatrix, b);
        }

        if (wIsWinner) {
            System.out.printf("Game over! White capture on %c%d.\n", colValues.get(bPosition[1]), rowValues.get(bPosition[0]));
        } else if (bIsWinner) {
            System.out.printf("Game over! Black capture on %c%d.\n", colValues.get(wPosition[1]), rowValues.get(wPosition[0]));
        } else {
            if (!isInBounds(wPosition[0] - 1, wPosition[1])) {
                System.out.printf("Game over! White pawn is promoted to a queen at %c%d.\n", colValues.get(wPosition[1]), rowValues.get(wPosition[0]));
            } else if (!isInBounds(bPosition[0] + 1, bPosition[1])) {
                System.out.printf("Game over! Black pawn is promoted to a queen at %c%d.\n", colValues.get(bPosition[1]), rowValues.get(bPosition[0]));
            }
        }

    }

    private static boolean isInBounds(int row, int col) {
        return row >= 0 && row <= 7 && col >= 0 && col <= 7;
    }

    private static void movePawn(char[][] matrix, char pawnColor) {
        int[] curPosition = getPositon(matrix, pawnColor);

        if (pawnColor == 'w') {
            matrix[curPosition[0]][curPosition[1]] = '-';
            matrix[curPosition[0] - 1][curPosition[1]] = pawnColor;
        } else {
            matrix[curPosition[0]][curPosition[1]] = '-';
            matrix[curPosition[0] + 1][curPosition[1]] = pawnColor;
        }
    }

    private static int[] getPositon(char[][] matrix, char pawnColor) {
        int[] position = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == pawnColor) {
                    position[0] = i;
                    position[1] = j;
                    break;
                }
            }
        }
        return position;
    }

    private static char[][] fillTheMatrix(Scanner scan) {
        char[][] matrix = new char[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }
        return matrix;
    }

    private static HashMap<Integer, Character> fillColValues() {
        HashMap<Integer, Character> rowValues = new HashMap<>();
        rowValues.put(0, 'a');
        rowValues.put(1, 'b');
        rowValues.put(2, 'c');
        rowValues.put(3, 'd');
        rowValues.put(4, 'e');
        rowValues.put(5, 'f');
        rowValues.put(6, 'g');
        rowValues.put(7, 'h');

        return rowValues;
    }

    private static HashMap<Integer, Integer> fillRowValues() {
        HashMap<Integer, Integer> rowValues = new HashMap<>();
        rowValues.put(0, 8);
        rowValues.put(1, 7);
        rowValues.put(2, 6);
        rowValues.put(3, 5);
        rowValues.put(4, 4);
        rowValues.put(5, 3);
        rowValues.put(6, 2);
        rowValues.put(7, 1);

        return rowValues;
    }
}