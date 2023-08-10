package E_ForLoop;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            if (curNum < 200) {
                p1 ++;
            } else if (curNum <= 399) {
                p2 ++;
            } else if (curNum <= 599) {
                p3 ++;
            } else if (curNum <= 799) {
                p4 ++;
            } else {
                p5 ++;
            }
        }
        double p1p = p1 * 1.0 / n * 100;
        double p2p = p2 * 1.0 / n * 100;
        double p3p = p3 * 1.0 / n * 100;
        double p4p = p4 * 1.0 / n * 100;
        double p5p = p5 * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1p);
        System.out.printf("%.2f%%%n", p2p);
        System.out.printf("%.2f%%%n", p3p);
        System.out.printf("%.2f%%%n", p4p);
        System.out.printf("%.2f%%%n", p5p);
    }
}
