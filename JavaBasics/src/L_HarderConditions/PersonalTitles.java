package L_HarderConditions;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String sex = scan.nextLine();
        String title = "";

        if (("m").equals(sex)) {
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        } else if (("f").equals(sex)) {
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        }
        System.out.println(title);
    }
}
