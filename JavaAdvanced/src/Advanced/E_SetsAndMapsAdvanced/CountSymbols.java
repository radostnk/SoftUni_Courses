package Advanced.E_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char curSymbol = input.charAt(i);

            if (!map.containsKey(curSymbol)) {
                map.put(curSymbol, 1);
            } else {
                int oldCount = map.get(curSymbol);
                map.put(curSymbol, oldCount + 1);
            }
        }

        map.forEach((key, value) -> {
            System.out.printf("%c: %d time/s\n", key, value);
        });
    }
}
