package L_HarderConditions;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        boolean isError = false;
        double comissionPercent = 0;

        switch (city) {
            case "Sofia":

                if (sales < 0) {
                    isError = true;
                } else if (sales <= 500) {
                    comissionPercent = 5;
                } else if (sales <= 1000) {
                    comissionPercent = 7;
                } else if (sales <= 10000){
                    comissionPercent = 8;
                } else {
                    comissionPercent = 12;
                }
                break;

            case "Varna":

                if (sales < 0) {
                    isError = true;
                } else if (sales <= 500) {
                    comissionPercent = 4.5;
                } else if (sales <= 1000) {
                    comissionPercent = 7.5;
                } else if (sales <= 10000){
                    comissionPercent = 10;
                } else if (sales > 10000){
                    comissionPercent = 13;
                }

                break;

            case "Plovdiv":

                if (sales < 0) {
                    isError = true;
                } else if (sales <= 500) {
                    comissionPercent = 5.5;
                } else if (sales <= 1000) {
                    comissionPercent = 8;
                } else if (sales <= 10000){
                    comissionPercent = 12;
                } else if (sales > 10000){
                    comissionPercent = 14.5;
                }

                break;

            default: isError = true; break;
        }

        double finalCommission = sales * comissionPercent / 100;

        if (isError) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", finalCommission);
        }
    }
}
