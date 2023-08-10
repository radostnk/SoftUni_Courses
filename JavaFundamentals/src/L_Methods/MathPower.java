package L_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        double finalNum = powerNum(num, power);

        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println(df.format(finalNum));
    }

    public static double powerNum(double num, int power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        return result;
    }
}
