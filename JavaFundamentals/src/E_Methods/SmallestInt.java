package E_Methods;

import java.util.Scanner;

public class SmallestInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int a = Integer.parseInt(scan.nextLine());
         int b = Integer.parseInt(scan.nextLine());
         int c = Integer.parseInt(scan.nextLine());

        printSmallestInt(a, b, c);
    }

    public static void printSmallestInt(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
