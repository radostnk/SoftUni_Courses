package L_Methods;

import java.util.Scanner;

public class CalcRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int area = calcRectArea(a, b);
        System.out.println(area);
    }

    public static int calcRectArea(int a, int b) {
        return  a * b;
    }
}
