package L_HarderConditions;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String weekday = scan.nextLine();
        String state = "";

        if (("Monday".equals(weekday) || "Tuesday".equals(weekday) || "Wednesday".equals(weekday) || "Thursday".equals(weekday) ||
                "Friday".equals(weekday) || "Saturday".equals(weekday)) && (hour >= 10 && hour <= 18)) {
            state = "open";
        } else {
            state = "closed";
        }

        System.out.println(state);
    }
}
