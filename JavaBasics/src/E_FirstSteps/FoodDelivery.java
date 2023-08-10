package E_FirstSteps;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chicken = Integer.parseInt(scan.nextLine());
        int fish = Integer.parseInt(scan.nextLine());
        int veggie = Integer.parseInt(scan.nextLine());

        double startPrice = chicken * 10.35 + fish * 12.4 + veggie * 8.15;
        double finalPrice = startPrice * 0.2 + startPrice + 2.5;

        System.out.println(finalPrice);
    }
}
