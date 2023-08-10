package E_FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, Integer> hpMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> mpMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);

            hpMap.put(name, hp);
            mpMap.put(name, mp);
        }

        String input = scan.nextLine();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" - ");
            String action = inputArr[0];
            String hero = inputArr[1];

            switch (action) {

                case "CastSpell": {
                    int mpNeeded = Integer.parseInt(inputArr[2]);
                    String spellName = inputArr[3];

                    if (mpNeeded <= mpMap.get(hero)) {
                        int newMp = mpMap.get(hero) - mpNeeded;
                        mpMap.put(hero, newMp);

                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", hero, spellName, newMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", hero, spellName);
                    }
                }
                break;

                case "TakeDamage": {
                    int damage = Integer.parseInt(inputArr[2]);
                    String attacker = inputArr[3];

                    if (hpMap.get(hero) - damage > 0) {
                        int newHp = hpMap.get(hero) - damage;
                        hpMap.put(hero, newHp);

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", hero, damage, attacker, newHp);
                    } else {
                        hpMap.remove(hero);
                        mpMap.remove(hero);
                        System.out.printf("%s has been killed by %s!\n", hero, attacker);
                    }

                }
                break;

                case "Recharge": {
                    int amount = Integer.parseInt(inputArr[2]);

                    if (mpMap.get(hero) + amount > 200) {
                        amount = 200 - mpMap.get(hero);
                        mpMap.put(hero, 200);
                    } else {
                        int newMp = mpMap.get(hero) + amount;
                        mpMap.put(hero, newMp);
                    }

                    System.out.printf("%s recharged for %d MP!\n", hero, amount);
                }
                break;

                case "Heal": {
                    int amount = Integer.parseInt(inputArr[2]);

                    if (hpMap.get(hero) + amount > 100) {
                        amount = 100 - hpMap.get(hero);
                        hpMap.put(hero, 100);
                    } else {
                        int newHp = hpMap.get(hero) + amount;
                        hpMap.put(hero, newHp);
                    }

                    System.out.printf("%s healed for %d HP!\n", hero, amount);
                }
                break;
            }

            input = scan.nextLine();
        }
        hpMap.forEach((key, value) -> {
            System.out.printf("%s\n  HP: %d\n  MP: %d\n", key, value, mpMap.get(key));
        });
    }
}