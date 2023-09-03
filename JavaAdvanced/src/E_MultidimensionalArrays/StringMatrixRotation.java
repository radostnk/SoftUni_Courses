package E_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine().split("[()]")[1]) % 360;
        String input = scan.nextLine();

        int rows = 0;
        int cols = Integer.MIN_VALUE;
        ArrayList<String> words = new ArrayList<>();

        while (!input.equals("END")) {
            rows ++;
            words.add(input);

            if (input.length() > cols) {
                cols = input.length();
            }

            input = scan.nextLine();
        }

        char[][] matrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String curWord = words.get(i);

            if (curWord.length() < cols) {
                StringBuilder sb = new StringBuilder(curWord);
                int spacesToAppend = cols - curWord.length();

                sb.append(" ".repeat(spacesToAppend));

//                for (int j = 0; j < spacesToAppend; j++) {
//                    sb.append(" ");
//                }

                curWord = sb.toString();
            }

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = curWord.charAt(j);
            }
        }

        switch (degrees) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }

    }
}
