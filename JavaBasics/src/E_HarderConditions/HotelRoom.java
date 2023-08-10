package E_HarderConditions;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double studioPrice = 0;
        double apartmentPrice = 0;


            if ("May".equals(month) || "October".equals(month)) {
                studioPrice = 50;
                apartmentPrice = 65;

                if (nights > 7 && nights <= 14) {
                    studioPrice -= studioPrice * 0.05;
                } else if (nights > 14) {
                    studioPrice -= studioPrice * 0.3;
                }

            } else if ("June".equals(month) || "September".equals(month)) {
                studioPrice = 75.2;
                apartmentPrice = 68.7;

                if (nights > 14) {
                    studioPrice -= studioPrice * 0.2;
                }

            } else if ("July".equals(month) || "August".equals(month)) {
                studioPrice = 76;
                apartmentPrice = 77;
            }

            if (nights > 14) {
                apartmentPrice -= apartmentPrice * 0.1;
            }
    System.out.printf("Apartment: %.2f lv.", apartmentPrice * nights);
    System.out.printf("\nStudio: %.2f lv.", studioPrice * nights);
    }
}