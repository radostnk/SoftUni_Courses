package L_HarderConditions;

import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean isValid = false;

        if (num >= 100 && num <= 200 || num == 0) {
            isValid = true;
        }

        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
