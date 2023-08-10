package L_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

        for (int i = 0; i < numsList.size() -1; i++) {
            int firstNum = numsList.get(i);
            int lastNum = numsList.get(numsList.size() - 1);

            numsList.set(i, firstNum + lastNum);
            numsList.remove(numsList.size() - 1);
        }

        for (int num : numsList) {
            System.out.print(num + " ");
        }
    }
}
