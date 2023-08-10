package E_BasicSyntax;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ordersCount = Integer.parseInt(scan.nextLine());
        double pricePerCapsule = 0;
        int days = 0;
        int capsulesCount = 0;
        double price =0;
        double totalPrice = 0;

        for (int i = 1; i <= ordersCount ; i++) {
            pricePerCapsule = Double.parseDouble(scan.nextLine());
            days = Integer.parseInt(scan.nextLine());
            capsulesCount = Integer.parseInt(scan.nextLine());

            price = (days * capsulesCount) * pricePerCapsule;
            totalPrice += price;

            System.out.printf("The price for the coffee is: $%.2f\n", price);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
