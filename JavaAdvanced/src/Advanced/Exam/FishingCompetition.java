package Advanced.Exam;

import java.util.Scanner;

public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());
        char[][] fishingArea = fillTheMatrix(scan, size);
        int fishCollected = 0;
        boolean fellIntoWhirlpool = false;

        String command = scan.nextLine();
        while (!command.equals("collect the nets")) {
            int[] oldFishermanPosition = getPosition(fishingArea, 'S');
            int[] newFishermanPosition = moveFisherman(fishingArea, command);

            if (!isInBounds(newFishermanPosition[0], newFishermanPosition[1], size)) {
                if (command.equals("right")) {
                    newFishermanPosition[1] = 0;

                } else if (command.equals("left")) {
                    newFishermanPosition[1] = size - 1;

                } else if (command.equals("up")) {
                    newFishermanPosition[0] = size - 1;

                } else if (command.equals("down")) {
                    newFishermanPosition[0] = 0;
                }
            }

            char targetPosition = fishingArea[newFishermanPosition[0]][newFishermanPosition[1]];

            if (targetPosition == 'W') {
                fishingArea[oldFishermanPosition[0]][oldFishermanPosition[1]] = '-';
                fishingArea[newFishermanPosition[0]][newFishermanPosition[1]] = 'S';

                fellIntoWhirlpool = true;
                fishCollected = 0;

                System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. " +
                        "Last coordinates of the ship: [%d,%d]\n", newFishermanPosition[0], newFishermanPosition[1]);
                break;

            } else if (Character.isDigit(targetPosition)) {
                int fishToCollect = Integer.parseInt(String.valueOf(targetPosition));
                fishCollected += fishToCollect;

                fishingArea[oldFishermanPosition[0]][oldFishermanPosition[1]] = '-';
                fishingArea[newFishermanPosition[0]][newFishermanPosition[1]] = 'S';

            } else if (targetPosition == '-') {
                fishingArea[oldFishermanPosition[0]][oldFishermanPosition[1]] = '-';
                fishingArea[newFishermanPosition[0]][newFishermanPosition[1]] = 'S';
            }

            command = scan.nextLine();
        }

        if (!fellIntoWhirlpool) {
            if (fishCollected >= 20) {
                System.out.println("Success! You managed to reach the quota!");
            } else {
                System.out.print("You didn't catch enough fish and didn't reach the quota! ");
                System.out.printf("You need %d tons of fish more.\n", 20 - fishCollected);
            }

            if (fishCollected > 0) {
                System.out.printf("Amount of fish caught: %d tons.\n", fishCollected);
            }

            printMatrix(fishingArea);
        }
    }

    private static int[] moveFisherman(char[][] matrix, String command) {
        int[] newFishermanPosition = getPosition(matrix, 'S');

        switch (command) {
            case "up":
                newFishermanPosition[0] -= 1;
                break;

            case "down":
                newFishermanPosition[0] += 1;
                break;

            case "right":
                newFishermanPosition[1] += 1;
                break;

            case "left":
                newFishermanPosition[1] -= 1;
                break;
        }
        return newFishermanPosition;
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
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

