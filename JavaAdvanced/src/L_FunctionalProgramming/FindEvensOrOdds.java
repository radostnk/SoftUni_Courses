package L_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] boundaries = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int from = boundaries[0];
        int to = boundaries[1];
        String numsToReturn = scan.nextLine();

        System.out.println(IntStream.rangeClosed(from, to)
                .boxed()
                .filter(getPredicate(numsToReturn))
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }

    public static Predicate<Integer> getPredicate(String condition) {
        if (condition.equals("odd")) {
            return n -> n % 2 != 0;
        }
        return n -> n % 2 == 0;
    }
}
