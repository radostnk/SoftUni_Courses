package E_DataTypes;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int people = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        double courses = Math.ceil((double) people / capacity);
        System.out.printf("%.0f", courses);
    }
}