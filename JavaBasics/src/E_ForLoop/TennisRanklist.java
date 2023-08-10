package E_ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournamentsNum = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());
        int tournamentPoints = 0;
        int winsCounter = 0;

        for (int i = 1; i <= tournamentsNum; i++) {
            String place = scan.nextLine();

            if ("W".equals(place)) {
                tournamentPoints += 2000;
                winsCounter ++;
            } else if ("F".equals(place)) {
                tournamentPoints += 1200;
            } else if ("SF".equals(place)) {
                tournamentPoints += 720;
            }
        }
        double averagePoints = Math.floor(tournamentPoints * 1.0 / tournamentsNum);
        double winsP = winsCounter * 1.0 / tournamentsNum * 100;

        System.out.printf("Final points: %d%n", tournamentPoints + startPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", winsP);
    }
}