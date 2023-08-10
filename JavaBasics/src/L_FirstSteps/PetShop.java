package L_FirstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFood = scan.nextInt();
        int catFood = scan.nextInt();

        double price = dogFood * 2.5 + catFood * 4;
        System.out.println(price + " lv.");
    }
}
