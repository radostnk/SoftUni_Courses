package E_BasicSyntax;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        double sum = 0;
        String product = "";

        while (!operation.equals("Start")) {
            double coin = Double.parseDouble(operation);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f\n", coin);
            } else {
                sum += coin;
            }
            operation = scan.nextLine();
        }
        operation = scan.nextLine();

        while (!operation.equals("End")) {
            product = operation;
            double price = 0;

            if (product.equals("Nuts")) {
                price = 2;
                if (price > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    sum -= price;
                    System.out.printf("Purchased %s\n", product);
                }

            } else if (product.equals("Water")) {
                price = 0.7;
                if (price > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    sum -= price;
                    System.out.printf("Purchased %s\n", product);
                }

            } else if (product.equals("Crisps")) {
                price = 1.5;
                if (price > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    sum -= price;
                    System.out.printf("Purchased %s\n", product);
                }

            } else if (product.equals("Soda")) {
                price = 0.8;
                if (price > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    sum -= price;
                    System.out.printf("Purchased %s\n", product);
                }

            } else if (product.equals("Coke")) {
                price = 1;
                if (price > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    sum -= price;
                    System.out.printf("Purchased %s\n", product);
                }
            } else {
                System.out.println("Invalid product");
            }

            operation = scan.nextLine();
        }
        System.out.printf("Change: %.2f\n", sum);
    }
}