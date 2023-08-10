package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));


        String[] info = scan.nextLine().split(" ");

        int bomb = Integer.parseInt(info[0]);
        int power = Integer.parseInt(info[1]);
        int sum = 0;

        while (numsList.contains(bomb)) {
            int bombIndex = numsList.indexOf(bomb);

            int min = Math.max(0, bombIndex - power);
            int max = Math.min(bombIndex + power, numsList.size() - 1);

            for (int i = max; i >= min; i--) {
                numsList.remove(i);
            }
        }

        for (int num : numsList) {
            sum += num;
        }
        System.out.println(sum);
    }
}
