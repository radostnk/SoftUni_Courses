package Advanced.ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        List<String> commands = Arrays.stream(scan.nextLine().split(",")).collect(Collectors.toList());
        String[][] fieldMatrix = fillMatrix(size, scan);

        int[] startPosition = getStartPosition(fieldMatrix);
        int startRow = startPosition[0];
        int startCol = startPosition[1];
        int initialBombsCount = getBombsCount(fieldMatrix);
        boolean outputPresent = false;

        for (String curCommand : commands) {

            switch (curCommand) {
                case "left":
                    if (isInBounds(startCol - 1, fieldMatrix.length)) {
                        startCol--;
                    }

                    break;

                case "right":
                    if (isInBounds(startCol + 1, fieldMatrix.length)) {
                        startCol++;
                    }
                    break;

                case "up":
                    if (isInBounds(startRow - 1, fieldMatrix.length)) {
                        startRow--;
                    }
                    break;

                case "down":
                    if (isInBounds(startRow + 1, fieldMatrix.length)) {
                        startRow++;
                    }
                    break;
            }

            String curElement = fieldMatrix[startRow][startCol];

            if (curElement.equals("B")) {
                System.out.println("You found a bomb!");
                fieldMatrix[startRow][startCol] = "+";
                initialBombsCount--;

                if (initialBombsCount <= 0) {
                    outputPresent = true;
                    System.out.println("Congratulations! You found all bombs!");
                    break;
                }

            } else if (curElement.equals("e")) {
                outputPresent = true;
                System.out.printf("END! %d bombs left on the field\n", initialBombsCount);
                break;
            }
        }

        if (!outputPresent) {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)\n", initialBombsCount, startRow, startCol);
        }
    }

    private static boolean isInBounds(int curCell, int matrixSize) {
        return curCell >= 0 && curCell < matrixSize;
    }
    private static int getBombsCount(String[][] fieldMatrix) {
        int bombsCount = 0;

        for (int i = 0; i < fieldMatrix.length; i++) {
            for (int j = 0; j < fieldMatrix.length; j++) {
                if (fieldMatrix[i][j].equals("B")) {
                    bombsCount ++;
                }
            }
        }

        return bombsCount;
    }

    private static int[] getStartPosition(String[][] fieldMatrix) {
        int[] startPosition = new int[2];

        for (int i = 0; i < fieldMatrix.length; i++) {
            for (int j = 0; j < fieldMatrix.length; j++) {
                if (fieldMatrix[i][j].equals("s")) {
                    startPosition[0] = i;
                    startPosition[1] = j;
                    break;
                }
            }
        }

        return startPosition;
    }

    public static String[][] fillMatrix(int size, Scanner scan) {
        String[][] fieldMatrix = new String[size][size];

        for (int i = 0; i < size; i++) {
            String[] row = scan.nextLine().split(" ");
            fieldMatrix[i] = row;
        }

        return fieldMatrix;
    }
}