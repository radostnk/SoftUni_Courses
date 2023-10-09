package Advanced.E_SetsAndMapsAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, HashSet<String>> map = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String player = input.split(":")[0];
            String[] deck = input.split(": ")[1].split(", ");

            if (!map.containsKey(player)) {
                map.put(player, new HashSet<>());
            }

            map.get(player).addAll(Arrays.asList(deck));
            input = scan.nextLine();
        }


//        for (Map.Entry<String,HashSet<String>> entry : map.entrySet()) {
//            int curSum = 0;
//
//            for (String card : entry.getValue()) {
//                curSum += getCardPoints(card);
//            }
//
//            System.out.printf("%s: %d\n", entry.getKey(), curSum);
//        }

        map.forEach((player, cards) -> {
            int curPlayerResult = 0;

            for (String card : cards) {
                curPlayerResult += getCardPoints(card);
            }

            System.out.printf("%s: %d\n", player, curPlayerResult);
        });

    }

    public static int getCardPoints(String card) {
        Map<Character, Integer> valuesMap = getCharValues();
        int power = 0;
        int type = 0;

        if (card.length() <= 2) {
            power = valuesMap.get(card.charAt(0));
            type = valuesMap.get(card.charAt(1));

        } else {
            power = 10;
            type = valuesMap.get(card.charAt(2));
        }
        return power * type;
    }

    public static Map<Character, Integer> getCharValues() {
        LinkedHashMap<Character, Integer> charValues = new LinkedHashMap<>();
        charValues.put('1', 1);
        charValues.put('2', 2);
        charValues.put('3', 3);
        charValues.put('4', 4);
        charValues.put('5', 5);
        charValues.put('6', 6);
        charValues.put('7', 7);
        charValues.put('8', 8);
        charValues.put('9', 9);
        charValues.put('J', 11);
        charValues.put('Q', 12);
        charValues.put('K', 13);
        charValues.put('A', 14);
        charValues.put('S', 4);
        charValues.put('H', 3);
        charValues.put('D', 2);
        charValues.put('C', 1);
        return charValues;
    }
}
//power -> 2-10, J -11, Q - 12, K - 13, A - 14
//type -> S - 4, H- 3, D - 2, C - 1
//power * type