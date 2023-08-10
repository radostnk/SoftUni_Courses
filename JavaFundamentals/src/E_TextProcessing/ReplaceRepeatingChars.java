package E_TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder newStr = new StringBuilder(input);

        for (int i = 0; i < newStr.length() - 1; i++) {
            char curSymbol = newStr.charAt(i);
            char nextSymbol = newStr.charAt(i + 1);

            if (curSymbol == nextSymbol) {
                newStr.deleteCharAt(i + 1);
                i --;
            }
        }

        System.out.println(newStr);
    }
}
