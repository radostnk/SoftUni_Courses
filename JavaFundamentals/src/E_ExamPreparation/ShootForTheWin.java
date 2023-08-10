package E_ExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> targetsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList()));

        String input = scan.nextLine();
        int targetsShotCount = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index >= 0 && index <= targetsList.size() - 1) {
                int curShootValue = targetsList.get(index);
                targetsList.set(index, -1);

                for (int i = 0; i < targetsList.size(); i++) {
                    int curTarget = targetsList.get(i);

                    if (-1 != curTarget) {

                        if (curTarget <= curShootValue) {
                            curTarget += curShootValue;
                        } else {
                            curTarget -= curShootValue;
                        }
                    }
                    targetsList.set(i, curTarget);
                }
                targetsShotCount ++;
            }
            input = scan.nextLine();
        }
        System.out.printf("Shot targets: %d -> %s", targetsShotCount, targetsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
