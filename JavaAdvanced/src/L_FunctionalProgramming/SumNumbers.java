package L_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], String> returnCountFunc = array -> String.format("Count = %d", array.length);
        Function<int[], Integer> sumFunc = array -> Arrays.stream(array).sum();
        Function<int[], String> returnSumFunc = array -> String.format("Sum = %d", sumFunc.apply(array));

        //find sum with reduce
        Function<int[], String> sumFunc2 = array -> String.valueOf(Arrays.stream(array).reduce(0, (first, sec) -> first + sec));

        System.out.println(returnCountFunc.apply(arr));
        System.out.println(returnSumFunc.apply(arr));
    }
}
