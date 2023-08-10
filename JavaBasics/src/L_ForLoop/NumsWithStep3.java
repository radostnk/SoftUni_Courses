package L_ForLoop;

import java.util.Scanner;

public class NumsWithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());

        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
}
