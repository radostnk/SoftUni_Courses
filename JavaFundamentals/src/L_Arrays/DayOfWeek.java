package L_Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String[] weekdays =  { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        if (n < 1 || n > 7) {
            System.out.println("Invalid day!");
        } else {
            System.out.println(weekdays[n - 1]);
        }
    }
}
