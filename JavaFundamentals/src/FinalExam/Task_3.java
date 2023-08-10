package FinalExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, ArrayList<String>> heroesMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0];
            String heroName = inputArr[1];

            if (command.equals("Enroll")) {

                if (heroesMap.containsKey(heroName)) {
                    System.out.printf("%s is already enrolled.\n", heroName);
                } else {
                    heroesMap.put(heroName, new ArrayList<>());
                }

            } else if (command.equals("Learn")) {

                String newSpellName = inputArr[2];

                if (!heroesMap.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.\n", heroName);
                } else {
                    if (heroesMap.get(heroName).contains(newSpellName)) {
                        System.out.printf("%s has already learnt %s.\n", heroName, newSpellName);
                    } else {
                        heroesMap.get(heroName).add(newSpellName);
                    }
                }
            } else if (command.equals("Unlearn")) {

                String rmSpellName = inputArr[2];

                if (!heroesMap.containsKey(heroName)) {
                    System.out.printf("%s doesn't exist.\n", heroName);
                } else {
                    if (!heroesMap.get(heroName).contains(rmSpellName)) {
                        System.out.printf("%s doesn't know %s.\n", heroName, rmSpellName);
                    } else {
                        heroesMap.get(heroName).remove(rmSpellName);
                    }
                }
            }

            input = scan.nextLine();
        }

        System.out.println("Heroes:");
        heroesMap.forEach((hero, spellBook) -> {
            System.out.printf("== %s: ", hero);
            if (spellBook.isEmpty()) {
                System.out.println();
            } else {
                System.out.println(String.join(", ", spellBook));
            }
        });
    }
}