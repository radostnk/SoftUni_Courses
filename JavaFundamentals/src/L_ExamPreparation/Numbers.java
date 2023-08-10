package L_ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        int sum = 0;

        for (int num : numsList) {
            sum += num;
        }
        double average = (double) sum / numsList.size();

        List<Integer> largerNums = new ArrayList<>();

        for (int num : numsList) {
            if (num > average) {
                largerNums.add(num);
            }
        }

        Collections.sort(largerNums);
        Collections.reverse(largerNums);

        if (largerNums.size() > 5) {
            for (int i = largerNums.size() - 1; i > 4; i--) {
                largerNums.remove(i);
            }
        }

        if (largerNums.size() > 0) {
            System.out.println(largerNums.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("No");
        }
    }
}
