package E_BasicSyntax;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());

        if (age <= 2) {
            System.out.println("baby");
        } else if (age <= 13) {
            System.out.println("child");
        } else if (age <= 19) {
            System.out.println("teenager");
        } else if (age <= 65){
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}