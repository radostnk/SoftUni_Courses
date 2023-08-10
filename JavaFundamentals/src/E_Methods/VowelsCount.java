package E_Methods;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();
        countVowels(input);
    }

    public static void countVowels(String str) {
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == 'a' || letter == 'o' || letter == 'u' || letter == 'e' || letter == 'i') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
