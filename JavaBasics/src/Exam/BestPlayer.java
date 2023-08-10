package Exam;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean madeHatTrick = false;
        String player = scan.nextLine();
        String bestPlayer = "";
        int mostGoals = 0;

        while (!player.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());

            if (mostGoals < goals) {
                mostGoals = goals;
                bestPlayer = player;
            }

            if (goals >= 3) {
                madeHatTrick = true;
            }
            if (goals >= 10) {
                break;
            }
            player = scan.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (madeHatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", mostGoals);
        } else {
            System.out.printf("He has scored %d goals.", mostGoals);
        }
    }
}