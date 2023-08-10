package E_DataTypes;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String largestModel = "";
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double curVolume = Math.PI * Math.pow(radius, 2) * height;

            if (curVolume > maxVolume) {
                maxVolume = curVolume;
                largestModel = model;
            }
        }
        System.out.println(largestModel);
    }
}