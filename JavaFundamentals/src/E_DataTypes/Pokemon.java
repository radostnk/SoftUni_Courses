package E_DataTypes;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pokePower = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());
        int pokesNum = 0;
        int startPokePower = pokePower;

        while (pokePower >= distance) {
            pokePower -= distance;
            pokesNum ++;

            if (pokePower == startPokePower / 2 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokesNum);
    }
}
