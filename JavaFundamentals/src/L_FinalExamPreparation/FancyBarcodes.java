package L_FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regex = "@#+[A-Z]+[A-Za-z0-9]{4,}[A-Z]+@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String barcode = scan.nextLine();
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {
                System.out.printf("Product group: %s\n", getGroup(barcode));
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    public static String getGroup(String barcode) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < barcode.length(); i++) {
            if (Character.isDigit(barcode.charAt(i))) {
                result.append(barcode.charAt(i));
            }
        }

        if (result.isEmpty()) {
            return "00";
        } else {
            return result.toString();
        }
    }
}
