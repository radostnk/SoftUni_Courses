package Advanced.E_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        Function<List<Integer>, Integer> smallestIntPosition = nums -> {
//            int minNum = Integer.MAX_VALUE;
//            int position = 0;
//
//            for (int i = 0; i < nums.size(); i++) {
//                if (nums.get(i) <= minNum) {
//                    minNum = nums.get(i);
//                    position = i;
//                }
//            }
//            return position;
//        };

        Function<List<Integer>, Integer> smallestIntPosition2 = nums -> {
            int minNum = nums.stream().mapToInt(e -> e).min().getAsInt();
            return nums.lastIndexOf(minNum);
        };

        System.out.println(smallestIntPosition2.apply(numbers));
    }
}
