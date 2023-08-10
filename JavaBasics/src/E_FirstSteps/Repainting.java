package E_FirstSteps;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coverage = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int liquid = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double startPrice = (coverage + 2) * 1.5 + (paint + paint * 0.1) * 14.5 + liquid * 5 + 0.4;
        double finalPrice = hours * (0.3 * startPrice) + startPrice;
        System.out.println(finalPrice);
    }
}
