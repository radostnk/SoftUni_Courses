package L_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(el -> el % 2 == 0)
                .toArray();

        System.out.println(Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(Arrays.stream(arr)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}
