package L_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .sorted((num, nextNum) -> num.compareTo(nextNum))
                .collect(Collectors.toList());

        Collections.reverse(list);
        for (int i = 0; i < 3; i++) {
            if (i > list.size() - 1) {
                break;
            }

            System.out.printf("%d ", list.get(i));
        }
    }
}
