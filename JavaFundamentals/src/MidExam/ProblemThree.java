package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> priceRatingsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(", "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));

        int entryPointIndex = Integer.parseInt(scan.nextLine());
        String priceRatingTargeted = scan.nextLine();

        int entryPointValue = priceRatingsList.get(entryPointIndex);
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < entryPointIndex ; i++) {
            int curValue = priceRatingsList.get(i);
            if (priceRatingTargeted.equals("cheap")) {

                if (curValue < entryPointValue) {
                    leftSum += curValue;
                }

            } else if (priceRatingTargeted.equals("expensive")) {
                if (curValue >= entryPointValue) {
                    leftSum += curValue;
                }
            }
        }

        for (int i = entryPointIndex + 1; i < priceRatingsList.size() ; i++) {
            int curValue = priceRatingsList.get(i);
            if (priceRatingTargeted.equals("cheap")) {

                if (curValue < entryPointValue) {
                    rightSum += curValue;
                }

            } else if (priceRatingTargeted.equals("expensive")) {
                if (curValue >= entryPointValue) {
                    rightSum += curValue;
                }
            }
        }

        if (rightSum > leftSum) {
            System.out.printf("Right - %d", rightSum);
        } else {
            System.out.printf("Left - %d", leftSum);
        }
    }
}
