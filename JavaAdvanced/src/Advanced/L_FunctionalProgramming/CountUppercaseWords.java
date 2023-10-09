package Advanced.L_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Predicate<String> startsWithUppercase = str -> Character.isUpperCase(str.charAt(0));

        List<String> result = Arrays.stream(scan.nextLine().split(" "))
                .filter(startsWithUppercase).collect(Collectors.toList());

        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
