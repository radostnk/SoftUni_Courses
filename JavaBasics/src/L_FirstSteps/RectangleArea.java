package L_FirstSteps;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int rectArea = a * b;
        System.out.println(rectArea);
    }
}
