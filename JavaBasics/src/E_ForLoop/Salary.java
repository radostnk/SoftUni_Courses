package E_ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabsNum = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        boolean stopFlag = false;

        for (int i = 1; i <= tabsNum ; i++) {
            String curTab = scan.nextLine();

            switch (curTab) {
                case "Facebook":
                    salary -= 150;
                    break;

                case "Instagram":
                    salary -= 100;
                    break;

                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                stopFlag = true;
                break;
            }
        }
        if (!stopFlag) {
            System.out.println(salary);
        }
    }
}