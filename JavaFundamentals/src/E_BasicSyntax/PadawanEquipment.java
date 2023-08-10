package E_BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double pricePerSaber = Double.parseDouble(scan.nextLine());
        double pricePerRobe = Double.parseDouble(scan.nextLine());
        double pricePerBelt = Double.parseDouble(scan.nextLine());


        double totalSaberPrice = (Math.ceil(studentsCount + studentsCount * 0.1)) * pricePerSaber;
        double totalRobePrice = studentsCount * pricePerRobe;
        double totalBeltPrice = (studentsCount - studentsCount/6) * pricePerBelt;
        double totalEquipmentPrice = totalSaberPrice + totalRobePrice + totalBeltPrice;

        double moneyNeeded = totalEquipmentPrice - budget;

        if (totalEquipmentPrice > budget) {
            System.out.printf("George Lucas will need %.2flv more.", moneyNeeded);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalEquipmentPrice);
        }
    }
}
