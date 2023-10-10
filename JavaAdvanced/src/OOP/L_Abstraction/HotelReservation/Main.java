package OOP.L_Abstraction.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] reservationInfo = scan.nextLine().split(" ");

        PriceCalculator calc = new PriceCalculator(Double.parseDouble(reservationInfo[0]),
                Integer.parseInt(reservationInfo[1]),
                Season.parse(reservationInfo[2]),
                DiscountType.parse(reservationInfo[3]));

        System.out.printf("%.2f", calc.calcPrice());

   }
}
