package OOP.E_InterfacesAndAbstraction.FoodShortage;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Buyer> buyers = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");

            switch (tokens.length) {
                case 3:
                    Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    buyers.put(tokens[0], rebel);
                    break;

                case 4:
                    Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                    buyers.put(tokens[0], citizen);
                    break;
            }
        }

        String curBuyer = scan.nextLine();

        while (!curBuyer.equals("End")) {

            if (buyers.containsKey(curBuyer)) {
                buyers.get(curBuyer).buyFood();
            }

            curBuyer = scan.nextLine();
        }

        int totalFoodBought = 0;
        for (Buyer buyer : buyers.values()) {
            totalFoodBought += buyer.getFood();
        }

        System.out.println(totalFoodBought);
    }
}
