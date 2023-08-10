package E_AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        boolean isWin = false;

        while (!isWin) {
            String[] input = scan.nextLine().split("\\s+");

            for (int i = 0; i < input.length - 1; i+=2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (!materialsMap.containsKey(material)) {
                    materialsMap.put(material, 0);
                }

                int curQuantity = materialsMap.get(material);
                materialsMap.put(material, curQuantity + quantity);

                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    isWin = true;
                    break;
                }

                if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                }

                if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }

            if (isWin) {
                break;
            }
        }

        materialsMap.forEach((key, value) -> System.out.println(key +": " + value));
    }
}