package E_HarderConditions;

import java.util.Scanner;

public class SummerClothing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();
        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":

                if (degrees <= 18 && degrees >= 10) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }

                break;

            case "Afternoon":

                if (degrees <= 18 && degrees >= 10) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }

                break;

            case "Evening":

                    outfit = "Shirt";
                    shoes = "Moccasins";

                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
