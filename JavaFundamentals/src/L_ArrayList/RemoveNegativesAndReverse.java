package L_ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

       // for (int element : numsList) {
       //     if (element < 0) {
       //         numsList.remove(element);
       //     }
       // }

        numsList.removeIf(n -> n < 0);
        Collections.reverse(numsList);

        if (numsList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
