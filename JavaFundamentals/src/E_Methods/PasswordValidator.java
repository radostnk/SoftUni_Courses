package E_Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();
        boolean isValidLength = checkLength(pass);
        boolean isValidSymbol = checkSymbols(pass);
        boolean isValidDigit = atLeastTwoDigits(pass);

        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidSymbol) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigit) {
            System.out.println("Password must have at least 2 digits"
            );
        }
        if (isValidDigit && isValidLength && isValidSymbol) {
            System.out.println("Password is valid");
        }
    }

    public static boolean checkLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean checkSymbols(String pass) {

        for (char symbol : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean atLeastTwoDigits(String pass) {
        int counter = 0;

        for (char symbol : pass.toCharArray()) {
            if (Character.isDigit(symbol)) {
                counter ++;
            }
        }
        return counter >= 2;
    }
}
