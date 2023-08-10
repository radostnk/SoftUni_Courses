package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String input = scan.nextLine();

        while (!input.equals("Finish")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            switch (command) {
                case "Replace":

                    String regex = inputArr[1];
                    String replacement = inputArr[2];
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(message);

                    while (matcher.find()) {
                        message = message.replace(regex, replacement);
                    }
                    System.out.println(message);

                    break;

                case "Cut":

                    int startIndex = Integer.parseInt(inputArr[1]);
                    int endIndex = Integer.parseInt(inputArr[2]) + 1;

                    if (startIndex < 0 || startIndex > message.length() || endIndex < startIndex || endIndex > message.length()) {
                        System.out.println("Invalid indices!");
                    } else {
                        StringBuilder sb = new StringBuilder(message);
                        sb.delete(startIndex, endIndex);
                        message = sb.toString();
                        System.out.println(message);
                    }

                    break;

                case "Make":

                    String caseType = inputArr[1];

                    if (caseType.equals("Upper")) {
                        message = message.toUpperCase();
                    } else if (caseType.equals("Lower")) {
                        message = message.toLowerCase();
                    }
                    System.out.println(message);

                    break;

                case "Check":

                    String substr = inputArr[1];

                    if (message.contains(substr)) {
                        System.out.println("Message contains " + substr);
                    } else {
                        System.out.println("Message doesn't contain " + substr);
                    }

                    break;

                case "Sum":

                    int firstIndex = Integer.parseInt(inputArr[1]);
                    int lastIndex = Integer.parseInt(inputArr[2]) + 1;

                    if (firstIndex < 0 || firstIndex > message.length() || lastIndex < firstIndex || lastIndex > message.length()) {
                        System.out.println("Invalid indices!");
                    } else {
                        int sum = 0;
                        String newStr = message.substring(firstIndex, lastIndex);

                        for (int i = 0; i < newStr.length(); i++) {
                            int curSymbol = newStr.charAt(i);
                            sum += curSymbol;
                        }
                        System.out.println(sum);
                    }

                    break;
            }

            input = scan.nextLine();
        }
    }
}
