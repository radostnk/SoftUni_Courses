package E_RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<StringBuilder> decryptedStrings = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();

            String keyStr = input.toLowerCase();
            int keyCount = 0;

            for (int j = 0; j < keyStr.toCharArray().length; j++) {
                char curChar = keyStr.charAt(j);

                if (curChar == 'a' || curChar == 's' || curChar == 't' || curChar == 'r') {
                    keyCount ++;
                }
            }

            StringBuilder decrypted = new StringBuilder();
            for (int j = 0; j < input.toCharArray().length; j++) {
                int curChar = input.charAt(j);
                curChar -= keyCount;
                decrypted.append((char) curChar);
            }
            decryptedStrings.add(decrypted);
        }

        String regEx = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*\\!(?<attackType>[AD])\\![^@\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern pattern = Pattern.compile(regEx);
        int attackedPlanets = 0;
        int destroyedPlanets = 0;
        TreeMap<String, String> planets = new TreeMap<>();

        for (int i = 0; i < decryptedStrings.size(); i++) {
            StringBuilder curStr = new StringBuilder(decryptedStrings.get(i));
            Matcher matcher = pattern.matcher(curStr);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                planets.put(planetName, attackType);

                if (attackType.equals("A")) {
                    attackedPlanets ++;
                } else if (attackType.equals("D")) {
                    destroyedPlanets ++;
                }
            }
        }

        System.out.printf("Attacked planets: %d\n", attackedPlanets);

        planets.forEach((planet, attackType) -> {
            if (attackType.equals("A")) {
                System.out.printf("-> %s\n", planet);
            }
        });

        System.out.printf("Destroyed planets: %d\n", destroyedPlanets);

        planets.forEach((planet, attackType) -> {
            if (attackType.equals("D")) {
                System.out.printf("-> %s\n", planet);
            }
        });
    }
}