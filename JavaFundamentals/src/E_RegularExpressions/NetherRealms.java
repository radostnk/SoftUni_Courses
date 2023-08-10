package E_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s*,\\s*");

        for (int i = 0; i < input.length; i++) {
            String curName = input[i];
            double baseDamage = getBaseDamage(curName);
            System.out.printf("%s - %d health, %.2f damage\n", curName, getDemonHealth(curName), getFinalDamage(curName, baseDamage));
        }
    }

    public static int getDemonHealth(String name) {
        String regex = "[^0-9\\+\\-\\*\\/\\.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        StringBuilder sb = new StringBuilder();
        int result = 0;

        while (matcher.find()) {
            sb.append(matcher.group());
        }

        for (int i = 0; i < sb.length(); i++) {
            char curSymbol = sb.charAt(i);
            result += (int) curSymbol;
        }

        return result;
    }

    public static double getBaseDamage(String name) {
        String numRegex = "[\\-]?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(numRegex);
        Matcher matcher = pattern.matcher(name);
        double result = 0;

        while (matcher.find()) {
            result += Double.parseDouble(matcher.group());
        }
        return result;
    }

    public static double getFinalDamage(String name, double baseDamage) {
        String regex = "[\\/\\*]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        int multiplyBy = 0;
        int divideBy = 0;

        while (matcher.find()) {
            if (matcher.group().equals("/")) {
                divideBy += 2;
            } else if (matcher.group().equals("*")) {
                multiplyBy += 2;
            }
        }
        if (multiplyBy > 0) {
            baseDamage *= multiplyBy;
        }

        if (divideBy > 0) {
            baseDamage /= divideBy;
        }

        return baseDamage;
    }
}