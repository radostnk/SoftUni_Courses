package L_Conditions;

import java.util.Scanner;

public class GuessPass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        String realPass = "s3cr3t!P@ssw0rd";

        if (pass.equals(realPass)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
