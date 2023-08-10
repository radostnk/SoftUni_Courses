package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstRow = scan.nextLine();
        String secondRow = scan.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            String curElement = secondArr[i];
            for (int j = 0; j < firstArr.length; j++) {
                if (curElement.equals(firstArr[j])) {
                    System.out.print(curElement + " ");
                }
            }
        }
    }
}
