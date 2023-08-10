package E_Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printMidCharacter(input);
    }
    public static void printMidCharacter(String str) {
        int index = str.length() / 2;

        if (str.length() % 2 == 0) {
            System.out.printf("%s%s", str.charAt(index -1), str.charAt(index));
        } else {
            System.out.println(str.charAt(index));
        }
    }
}
