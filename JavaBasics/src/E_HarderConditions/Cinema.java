package E_HarderConditions;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        double price = 0;
        int places = rows * cols;

        switch (projection) {
            case "Premiere":
                price = 12 * places;
                break;

            case "Normal":
                price = 7.5 * places;
                break;

            case "Discount":
                price = 5 * places;
                break;
        }
        System.out.printf("%.2f", price);
    }
}