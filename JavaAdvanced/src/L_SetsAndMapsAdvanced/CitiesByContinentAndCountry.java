package L_SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> continentsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArr = scan.nextLine().split(" ");
            String continent = inputArr[0];
            String country = inputArr[1];
            String city = inputArr[2];

            if (!continentsMap.containsKey(continent)) {
                continentsMap.put(continent, new LinkedHashMap<>());
            }

            if (!continentsMap.get(continent).containsKey(country)) {
                continentsMap.get(continent).put(country, new ArrayList<>());
            }

            continentsMap.get(continent).get(country).add(city);
        }

        continentsMap.forEach((continent, countryValue) -> {
            System.out.println(continent + ":");
            countryValue.forEach((countryKey, city) -> {
                System.out.printf(" %s -> ", countryKey);
                System.out.println(String.join(", ", city));
            });
        });
    }
}
