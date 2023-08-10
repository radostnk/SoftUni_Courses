package L_FirstSteps;

import java.util.Scanner;

public class Greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sqm = Double.parseDouble(scan.nextLine());
        double price = 7.61 * sqm;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
