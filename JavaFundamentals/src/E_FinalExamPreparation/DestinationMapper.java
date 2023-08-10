package E_FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "([=\\/]{1})[A-Z]+[A-Za-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int points = 0;

        while (matcher.find()) {
            String curMatch = matcher.group();
            curMatch = curMatch.replaceAll("[=/]", "");
            destinations.add(curMatch);

            for (int i = 0; i < curMatch.length(); i++) {
                points ++;
            }
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + points);
    }
}