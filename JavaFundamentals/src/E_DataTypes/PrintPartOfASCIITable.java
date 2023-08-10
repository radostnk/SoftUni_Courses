package E_DataTypes;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        String result = "";

        for (int i = start; i <= end; i++) {
            char curChar = (char) i;
            result += curChar;
            result += " ";
        }
        System.out.println(result);
    }
}