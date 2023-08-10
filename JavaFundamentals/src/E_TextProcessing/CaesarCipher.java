package E_TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int symbol : input.toCharArray()) {
            symbol += 3;
            encrypted.append((char) symbol);
        }
        System.out.println(encrypted);
    }
}
