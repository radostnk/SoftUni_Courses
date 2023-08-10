package E_WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String favBook = scan.nextLine();
        String input = scan.nextLine();
        int counter = 0;
        boolean breakFlag = false;

        while (!"No More Books".equals(input)) {
            String curBook = input;

            if (curBook.equals(favBook)) {
                breakFlag = true;
                System.out.printf("You checked %d books and found it.", counter);
                break;
            }
            counter ++;
            input = scan.nextLine();
        }
        if (!breakFlag) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
        }
    }
}