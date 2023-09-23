package E_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divisor = Integer.parseInt(scan.nextLine());

        Predicate<Integer> filter = num -> num % divisor == 0;

        numbers.removeIf(filter);
        Collections.reverse(numbers);

        numbers.forEach(num -> System.out.printf("%d ", num));
    }
}
