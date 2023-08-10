package E_FirstSteps;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
/* Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден. */
        Scanner scan = new Scanner(System.in);
        int pagesNum = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysForReading = Integer.parseInt(scan.nextLine());

        int hoursReading = pagesNum / pagesPerHour / daysForReading;
        System.out.println(hoursReading);
    }
}
