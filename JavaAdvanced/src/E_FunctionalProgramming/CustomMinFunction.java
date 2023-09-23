package E_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<int[], Integer> minFunc = nums -> {
            int smallestNum = Integer.MAX_VALUE;
            for (int num : nums) {
                if (num < smallestNum) {
                    smallestNum = num;
                }
            }
            return smallestNum;
        };

        Function<int[], Integer> minFunc2 = nums -> Arrays.stream(nums).min().getAsInt();
        Function<int[], Integer> minFunc3 = nums -> Collections.min(Arrays.stream(nums).boxed().toList());

        System.out.println(minFunc.apply(Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray()));

        //---------- Integer[]
        Function<Integer[], Integer> minFunc4 = nums -> Collections.min(Arrays.stream(nums).toList());

        System.out.println(minFunc4.apply(Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).toArray(Integer[]::new)));
    }
}
