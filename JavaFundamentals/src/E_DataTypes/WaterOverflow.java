package E_DataTypes;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short n = Short.parseShort(scan.nextLine());
        short capacity = 255;
        short litresPoured = 0;

        for (int i = 1; i <= n; i++) {
            short litres = Short.parseShort(scan.nextLine());

            if ((capacity - litres) >= 0) {
                capacity -= litres;
                litresPoured += litres;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litresPoured);
    }
}