package E_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String regEx = "(?<user>\\b[A-Za-z0-9]+[\\.\\-_]?[A-Za-z0-9]+)@(?<host>[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z]+)+)";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
