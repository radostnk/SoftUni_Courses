package E_BasicSyntax;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String pass = "";
        String inputPass = scan.nextLine();
        int failedLogins = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char curSymbol = username.charAt(i);
            pass += curSymbol;
        }

        while (!inputPass.equals(pass)) {
            failedLogins ++;

            if (failedLogins == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            inputPass = scan.nextLine();
        }
        if (inputPass.equals(pass)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
