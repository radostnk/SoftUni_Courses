package L_Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();
        int repeatTimes = Integer.parseInt(scan.nextLine());

        String finalStr = repeatStr(inputStr, repeatTimes);
        System.out.println(finalStr);
    }

    public static String repeatStr(String str, int n) {
        String finalStr = "";

        for (int i = 1; i <= n; i++) {
            finalStr += str;
        }
        return finalStr;
    }
}
