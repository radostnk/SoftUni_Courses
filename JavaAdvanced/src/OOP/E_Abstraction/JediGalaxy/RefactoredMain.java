package OOP.E_Abstraction.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class RefactoredMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        BattleField field = new BattleField(rows, cols);
        Galaxy galaxy = new Galaxy(field);

        String command = scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordinates = getCoordinates(command);
            int[] evilCoordinates = getCoordinates(scanner.nextLine());

            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            galaxy.moveEvil(evilRow, evilCol);

            int jediRow = jediCoordinates[0];
            int jediCol = jediCoordinates[1];

            long starsCollected = galaxy.getJediStars(jediRow, jediCol);

            command = scanner.nextLine();
            System.out.println(starsCollected);
        }
    }

    private static int[] getCoordinates(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

}
