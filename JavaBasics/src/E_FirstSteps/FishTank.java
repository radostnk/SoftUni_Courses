package E_FirstSteps;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());;
        double percent = Double.parseDouble(scan.nextLine());

        double capacity = (length * width * height);
        double capacityLitres = capacity * 0.001;
        double takenCapacity = capacityLitres * (percent / 100);
        double capacityLitresFinal = capacityLitres - takenCapacity;
        System.out.println(capacityLitresFinal);
    }
}