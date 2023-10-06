package E_IteratorsAndComparators.Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> rocks = Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        Lake lake = new Lake(rocks);

        ArrayList<String> result = new ArrayList<>();

        for (Integer rock : lake) {
            result.add(String.valueOf(rock));
        }

        System.out.println(String.join(", ", result));
    }
}
