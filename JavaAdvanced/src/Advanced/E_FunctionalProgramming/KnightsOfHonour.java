package Advanced.E_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Consumer<String> printFunc = el -> System.out.println("Sir " + el);

        Arrays.stream(scan.nextLine().split("\\s+")).forEach(printFunc);
    }
}
