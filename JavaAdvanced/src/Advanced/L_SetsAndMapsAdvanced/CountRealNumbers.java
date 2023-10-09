package Advanced.L_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] input = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        LinkedHashMap<Double, Integer> numsMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double curNum = input[i];

            if (!numsMap.containsKey(curNum)) {
                numsMap.put(curNum, 1);
            } else {
                int curValue = numsMap.get(curNum);
                numsMap.put(curNum, curValue + 1);
            }
        }
        numsMap.forEach((entry, value) -> {
            System.out.printf("%.1f -> %d\n", entry, value);
        });
    }
}
