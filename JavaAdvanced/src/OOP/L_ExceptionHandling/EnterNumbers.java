package OOP.L_ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = 1;
        int end = 100;

        ArrayList<String> list = new ArrayList<>();

        while (list.size() < 10) {

            try {
                int curNum = readNumber(start, end, scan);
                list.add(String.valueOf(curNum));
                start = curNum;

            } catch (NumberFormatException ignored) {
                System.out.println("Invalid Number!");

            } catch (NumberNotInRangeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(String.join(", ", list));
    }

    public static int readNumber(int start, int end, Scanner scan) {

        int num = Integer.parseInt(scan.nextLine());

        if (!(num > start && num < end)) {
            throw new NumberNotInRangeException(String.format("Your number is not in range %d - %d!", start, end));
        }

        return num;
    }
}
