package Advanced.E_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        List<String> names = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> filter = name -> name.length() <= length;
        Consumer<String> print = System.out::println;

        names.stream().filter(filter).forEach(print);
        //names.stream().filter(name -> name.length() <= length).forEach(System.out::println);
    }
}
