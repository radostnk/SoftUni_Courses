package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String regex = "^([$%]{1})(?<tag>[A-Z]{1}[a-z]{2,})\\1: \\[(?<numOne>[\\d]+)\\]\\|\\[(?<numTwo>[\\d]+)\\]\\|\\[(?<numThree>[\\d]+)\\]\\|$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                String tag = matcher.group("tag");
                StringBuilder sb = new StringBuilder();
                int sum = 0;
                int numOne = Integer.parseInt(matcher.group("numOne"));
                int numTwo = Integer.parseInt(matcher.group("numTwo"));
                int numThree = Integer.parseInt(matcher.group("numThree"));

                int[] intArr = {numOne, numTwo, numThree};

                for (int j = 0; j < intArr.length; j++) {
                    sb.append((char) intArr[j]);
                }

                System.out.printf("%s: %s\n", tag, sb.toString());

            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
