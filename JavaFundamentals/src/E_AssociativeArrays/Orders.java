package E_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> quantityMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("buy")) {

            String[] inputArr = input.split(" ");
            String product = inputArr[0];
            double price = Double.parseDouble(inputArr[1]);
            int quantity = Integer.parseInt(inputArr[2]);

            if (!priceMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                quantityMap.put(product, quantityMap.get(product) + quantity);
            }
            priceMap.put(product, price);

            input = scan.nextLine();
        }

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            String curProduct = entry.getKey();
            double totalPrice = quantityMap.get(curProduct) * entry.getValue();

            System.out.printf("%s -> %.2f\n", curProduct, totalPrice);
        }
    }
}
