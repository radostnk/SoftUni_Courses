package E_RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<furiturePrice>\\d+\\.?\\d*)!(?<furnitureQuantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;
        List<String> furniture = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                double curPrice = Double.parseDouble(matcher.group(2));
                int curQuantity = Integer.parseInt(matcher.group(3));
                totalPrice += curPrice * curQuantity;
                furniture.add(matcher.group(1));
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(entry -> System.out.println(entry));
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
