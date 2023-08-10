package E_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<Character, Integer> countOfCharsMap = new LinkedHashMap<>();
        String input = scan.nextLine();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }

            if (!countOfCharsMap.containsKey(symbol)) {
                countOfCharsMap.put(symbol, 0);
            }
            int curValue = countOfCharsMap.get(symbol);
            countOfCharsMap.put(symbol, curValue + 1);
        }
        for (Map.Entry<Character, Integer> curCouple : countOfCharsMap.entrySet()) {
            System.out.println(curCouple.getKey() + " -> " + curCouple.getValue());
        }

        //countOfCharsMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
