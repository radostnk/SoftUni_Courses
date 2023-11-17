package OOP.L_ExceptionHandling;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] range = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        boolean isValid = false;

        String input = scan.nextLine();
        Optional<Integer> inputNum = Optional.empty();

        System.out.printf("Range: [%d...%d]\n", range[0], range[1]);

        while (!isValid) {

            try {
                inputNum = Optional.of(Integer.parseInt(input));

            } catch (NumberFormatException ignored) {

            }

            isValid = isInRange(inputNum, range);

            if (isValid) {
                System.out.printf("Valid number: %s\n", input);
                break;
            } else {
                System.out.printf("Invalid number: %s\n", input);
            }

            input = scan.nextLine();
        }
    }

    private static boolean isInRange(Optional<Integer> inputNum, int[] range) {
        return inputNum.isPresent() && inputNum.get() <= range[1] && inputNum.get() >= range[0];
    }
}
