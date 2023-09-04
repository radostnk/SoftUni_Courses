package L_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        TreeSet<String> guestsSet = new TreeSet<>();

        while (!input.equals("PARTY")) {
            guestsSet.add(input);
            input = scan.nextLine();
        }

        while (!input.equals("END")) {
            guestsSet.remove(input);
            input = scan.nextLine();
        }
        System.out.println(guestsSet.size());
        guestsSet.forEach(guest -> System.out.println(guest));
    }
}
