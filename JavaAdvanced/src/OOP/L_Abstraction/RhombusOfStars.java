package OOP.L_Abstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printRhombus(n);

//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= n - 1; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < n - i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }

    public static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printTriangle(size - i, i);
        }
        for (int i = 1; i <= size - 1; i++) {
            printTriangle(i, size - i);
        }
    }
    private static void printTriangle(int firstCount, int secondCount) {
        for (int i = 0; i < firstCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < secondCount; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
