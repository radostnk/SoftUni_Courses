package L_ArrayList;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numsList = new ArrayList<>();
        numsList = Arrays.stream(scan.nextLine().split(" ")).map(e -> Double.parseDouble(e)).collect(Collectors.toList());


        for (int i = 0; i < numsList.size() - 1; i++) {
            double curNum = numsList.get(i);
            double nextNum = numsList.get(i + 1);

            if (curNum == nextNum) {
                numsList.set(i, curNum + nextNum);
                numsList.remove(nextNum);
                i = -1;
            }
        }
        System.out.println(joinElements(numsList, " "));
    }

    public static String joinElements(List<Double> items, String delimiter) {
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";

        for (double item : items) {
            result += df.format(item) + delimiter;
        }
        return result;
    }
}
