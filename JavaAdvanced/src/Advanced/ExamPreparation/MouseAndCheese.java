package Advanced.ExamPreparation;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        char[][] matrix = fillTheMatrix(scan, n);
        int cheeseEaten = 0;
        String command = scan.nextLine();

        while (!command.equals("end")) {
            int[] oldMousePosition = getPosition(matrix, 'M');
            int[] newMousePosition = moveMouse(matrix, command);;

            if (!isInBounds(newMousePosition[0], newMousePosition[1], n)) {
                matrix[oldMousePosition[0]][oldMousePosition[1]] = '-';
                System.out.println("Where is the mouse?");
                break;
            }

            if (matrix[newMousePosition[0]][newMousePosition[1]] == 'c') {
                matrix[newMousePosition[0]][newMousePosition[1]] = 'M';
                matrix[oldMousePosition[0]][oldMousePosition[1]] = '-';
                cheeseEaten ++;

            } else if (matrix[newMousePosition[0]][newMousePosition[1]] == '-') {
                matrix[oldMousePosition[0]][oldMousePosition[1]] = '-';
                matrix[newMousePosition[0]][newMousePosition[1]] = 'M';

            } else if (matrix[newMousePosition[0]][newMousePosition[1]] == 'B') {
                matrix[oldMousePosition[0]][oldMousePosition[1]] = '-';
                matrix[newMousePosition[0]][newMousePosition[1]] = 'M';

                int[] bonusMovePosition = moveMouse(matrix, command);
                matrix[newMousePosition[0]][newMousePosition[1]] = '-';

                if (matrix[bonusMovePosition[0]][bonusMovePosition[1]] == 'c') {
                    cheeseEaten ++;
                }

                matrix[bonusMovePosition[0]][bonusMovePosition[1]] = 'M';
            }

            command = scan.nextLine();
        }

        if (cheeseEaten < 5) {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.\n", 5 - cheeseEaten);
        } else {
            System.out.printf("Great job, the mouse is fed %d cheeses!\n", cheeseEaten);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] moveMouse(char[][] matrix, String command) {
        int[] newMousePosition = getPosition(matrix, 'M');

        switch (command) {
            case "up":
                newMousePosition[0] -= 1;
                break;

            case "down":
                newMousePosition[0] += 1;
                break;

            case "right":
                newMousePosition[1] += 1;
                break;

            case "left":
                newMousePosition[1] -= 1;
                break;
        }
        return newMousePosition;
    }

    private static boolean isInBounds(int row, int col, int size) {
        return row >= 0 && col >= 0 && row < size && col < size;
    }

    private static int[] getPosition(char[][] matrix, char ch) {
        int[] position = new int[2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == ch) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    private static char[][] fillTheMatrix(Scanner scan, int n) {
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }

        return matrix;
    }
}
