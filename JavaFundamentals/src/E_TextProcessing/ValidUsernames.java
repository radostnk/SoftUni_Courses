package E_TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        boolean isValid = false;

        for (int i = 0; i < input.length; i++) {
            String curName = input[i];

            if (curName.length() > 3 && curName.length() < 16) {
                for (char symbol : curName.toCharArray()) {
                    if (Character.isLetterOrDigit(symbol) || symbol=='-' || symbol=='_') {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            } else {
                isValid = false;
            }

            if (isValid) {
                System.out.println(curName);
            }
        }
    }
}
