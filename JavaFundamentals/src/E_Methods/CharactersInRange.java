package E_Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startSymbol = scan.nextLine().charAt(0);
        char endSymbol = scan.nextLine().charAt(0);

        printCharactersInRange(startSymbol, endSymbol);
    }

    public static void printCharactersInRange(char start, char end) {
        if (end < start) {
            char oldValue = start;
            start = end;
            end = oldValue;
        }

        for (int i = start + 1; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
