package E_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Integer[] divisors = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Predicate<Integer> isDivisible = num -> {
            for (Integer divisor : divisors) {
                if (num % divisor != 0) {
                    return false;
                }
            }
            return true;
        };

        IntStream.rangeClosed(1,n).boxed().filter(isDivisible).forEach(e -> System.out.printf("%d ", e));
    }
}
