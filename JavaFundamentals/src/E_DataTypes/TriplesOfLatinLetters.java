package E_DataTypes;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for (int letter1 = 'a'; letter1 < 'a' + num; letter1++) {
            for (int letter2 = 'a'; letter2 < 'a' + num; letter2++) {
                for (int letter3 = 'a'; letter3 < 'a' + num; letter3++) {
                    System.out.printf("%c%c%c\n", letter1, letter2, letter3);
                }
            }
        }
    }
}
