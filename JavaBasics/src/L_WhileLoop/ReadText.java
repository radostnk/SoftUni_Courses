package L_WhileLoop;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!"Stop".equals(input)) {
            System.out.printf("%s%n", input);
            input = scan.nextLine();
        }
    }
}
