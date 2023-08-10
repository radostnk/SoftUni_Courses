package E_ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int judgesNum = Integer.parseInt(scan.nextLine());
        double totalPoints = academyPoints;
        boolean breakFlag = false;

        for (int i = 1; i <= judgesNum; i++) {
            String judgeName = scan.nextLine();
            double judgePoints = Double.parseDouble(scan.nextLine());

            int nameLength = judgeName.length();
            double curPoints = (nameLength * judgePoints) / 2;
            totalPoints += curPoints;

            if (totalPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                breakFlag = true;
                break;
            }
        }
        if (!breakFlag) {
            double diff = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}