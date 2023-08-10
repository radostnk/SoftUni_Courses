package E_ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupsNum = Integer.parseInt(scan.nextLine());
        int totalTrekkers = 0;
        int musalaTrekkers = 0;
        int monblanTrekkers = 0;
        int kilimandjaroTrekkers = 0;
        int k2Trekkers = 0;
        int everestTrekkers = 0;


        for (int i = 0; i < groupsNum; i++) {
            int trekkersPerGroup = Integer.parseInt(scan.nextLine());
            totalTrekkers += trekkersPerGroup;

            if (trekkersPerGroup <= 5) {
                musalaTrekkers += trekkersPerGroup;
            } else if (trekkersPerGroup <= 12) {
                monblanTrekkers += trekkersPerGroup;
            } else if (trekkersPerGroup <= 25) {
                kilimandjaroTrekkers += trekkersPerGroup;
            } else if (trekkersPerGroup <= 40) {
                k2Trekkers += trekkersPerGroup;
            } else {
                everestTrekkers += trekkersPerGroup;
            }
        }
        double musalaP = musalaTrekkers * 1.0 / totalTrekkers * 100.0;
        double monblanP = monblanTrekkers * 1.0 / totalTrekkers * 100.0;
        double kilimandjaroP = kilimandjaroTrekkers * 1.0 / totalTrekkers * 100.0;
        double k2P = k2Trekkers * 1.0 / totalTrekkers * 100.0;
        double everestP = everestTrekkers * 1.0 / totalTrekkers * 100.0;

        System.out.printf("%.2f%%%n", musalaP);
        System.out.printf("%.2f%%%n", monblanP);
        System.out.printf("%.2f%%%n", kilimandjaroP);
        System.out.printf("%.2f%%%n", k2P);
        System.out.printf("%.2f%%%n", everestP);
    }
}