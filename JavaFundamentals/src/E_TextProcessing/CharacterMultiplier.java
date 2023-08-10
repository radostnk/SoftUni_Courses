package E_TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        System.out.println(sumOfCharacters(input[0], input[1]));
    }

    public static int sumOfCharacters(String str1, String str2) {
        String longerStr = "";
        String shorterStr = "";
        int sum = 0;

        if (str1.length() > str2.length()) {
            longerStr = str1;
            shorterStr = str2;
        } else {
            longerStr = str2;
            shorterStr = str1;
        }

        for (int i = 0; i < shorterStr.length(); i++) {
            sum += str1.charAt(i) * str2.charAt(i);
        }

        if (longerStr.length() != shorterStr.length()) {
            int index = shorterStr.length();
            String subStr = longerStr.substring(index);

            for (int symbol : subStr.toCharArray()) {
                sum += symbol;
            }
        }
        return sum;
    }
}
