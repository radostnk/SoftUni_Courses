package E_Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        System.out.println(subtract(a, b, c));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b, int c) {
        return sum(a, b) - c;
    }
}
