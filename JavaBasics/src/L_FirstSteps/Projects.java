package L_FirstSteps;

import java.util.Scanner;

public class Projects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int projectsNum = Integer.parseInt(scan.nextLine());
        int hours = projectsNum * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projectsNum);
    }
}
