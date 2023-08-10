package E_TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder inputSb = new StringBuilder(input);
        int powerLeft = 0;

        for (int i = 0; i < inputSb.length(); i++) {
            char curCharacter = inputSb.charAt(i);

            if (curCharacter == '>') {
                int power = Integer.parseInt(String.valueOf(inputSb.charAt(i + 1)));

                if (power > inputSb.length() - 2 - i) {
                    power = inputSb.length() - 2 - i;
                }

                String toDelete = inputSb.substring(i + 1, i + 1 + power);

                if (toDelete.contains(">")) {
                    int index = toDelete.indexOf('>');
                    power = 0;

                    for (int j = 0; j < index; j++) {
                        power++;
                    }

                    for (int j = index; j < toDelete.length(); j++) {
                        powerLeft++;
                    }

                    inputSb.delete(i + 1, i + 1 + power);

                } else {
                    inputSb.delete(i + 1, i + 1 + power + powerLeft);
                    powerLeft = 0;
                }
            }
        }
        System.out.println(inputSb);
    }
}
