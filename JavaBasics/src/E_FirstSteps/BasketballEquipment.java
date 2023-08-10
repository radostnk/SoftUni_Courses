package E_FirstSteps;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearlyTax = Integer.parseInt(scan.nextLine());

        double shoes = yearlyTax - yearlyTax * 0.4;
        double clothing = shoes - shoes * 0.2;
        double ball = clothing / 4;
        double accessories = ball / 5;
        double finalPrice = shoes + clothing + ball + accessories + yearlyTax;

        System.out.println(finalPrice);
    }
}
