package E_HarderConditions;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHour = Integer.parseInt(scan.nextLine());
        int examMins = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMins = Integer.parseInt(scan.nextLine());
        String state = "";

        int examMinsOnly = examMins + examHour * 60;
        int arriveMinsOnly = arriveMins + arriveHour * 60;

        if (arriveMinsOnly > examMinsOnly ) {
            state = "Late";
        } else if (examMinsOnly - arriveMinsOnly >= 0 && examMinsOnly - arriveMinsOnly <= 30) {
            state = "On time";
        } else if (examMinsOnly - arriveMinsOnly > 30){
            state = "Early";
        }
        System.out.println(state);

        if (arriveMinsOnly - examMinsOnly != 0) {
            if (examMinsOnly - arriveMinsOnly < 60 && examMinsOnly - arriveMinsOnly > 0) {
                int early = examMinsOnly - arriveMinsOnly;
                System.out.printf("%d minutes before the start", early);
            } else if (examMinsOnly - arriveMinsOnly >= 60) {

                int earlier = examMinsOnly - arriveMinsOnly;
                int hoursEarlier = earlier / 60;
                int minsEarlier = earlier % 60;

                if (minsEarlier < 10) {
                    System.out.printf("%d:0%d hours before the start", hoursEarlier, minsEarlier);
                } else {
                    System.out.printf("%d:%d hours before the start", hoursEarlier, minsEarlier);
                }

            } else if (arriveMinsOnly - examMinsOnly < 60 && arriveMinsOnly - examMinsOnly > 0) {
                int later = arriveMinsOnly - examMinsOnly;
                System.out.printf("%d minutes after the start", later);
            } else if (arriveMinsOnly - examMinsOnly >= 60) {

                int later = arriveMinsOnly - examMinsOnly;
                int hoursLater = later / 60;
                int minsLater = later % 60;

                if (minsLater < 10) {
                    System.out.printf("%d:0%d hours after the start", hoursLater, minsLater);
                } else {
                    System.out.printf("%d:%d hours after the start", hoursLater, minsLater);
                }
            }
        }
    }
}