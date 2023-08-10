package E_FirstSteps;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pensNum = Integer.parseInt(scan.nextLine());
        int markersNum = Integer.parseInt(scan.nextLine());
        double litres = Integer.parseInt(scan.nextLine());
        double discount = Integer.parseInt(scan.nextLine());

        double priceStart = (pensNum * 5.80 + markersNum * 7.20 + litres * 1.20);
        double priceEnd = priceStart - (priceStart * discount / 100);
        System.out.println(priceEnd);
    }
}
