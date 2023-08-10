package E_DataTypes;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int d = Integer.parseInt(scan.nextLine());

        int result = ((a + b) / c) * d;
        System.out.println(result);
    }
}
