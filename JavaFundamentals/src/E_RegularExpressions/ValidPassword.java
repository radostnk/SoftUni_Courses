package E_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String regEx = "_\\.+[A-Z]+[A-Za-z0-9]{4,}[A-Z]+_\\.+";
        Pattern pattern = Pattern.compile(regEx);

        for (int i = 1; i <= n; i++) {
            String curPass = scan.nextLine();
            Matcher matcher = pattern.matcher(curPass);

            if (matcher.find()) {
                String group = determineGroup(curPass);
                System.out.printf("Group: %s\n", group);
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }

    public static String determineGroup(String pass) {
        char[] passArr = pass.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < passArr.length; i++) {
            if (Character.isDigit(passArr[i])) {
                result.append(passArr[i]);
            }
        }

        if (result.isEmpty()) {
            return "default";
        } else {
            return result.toString();
        }
    }
}
