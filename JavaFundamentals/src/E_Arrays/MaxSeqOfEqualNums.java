package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSeqOfEqualNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numsArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String finalResult = "";
        int maxSequence = 0;

        for (int i = 0; i < numsArr.length; i++) {
            int curNum = numsArr[i];
            int countEquals = 0;
            String curResult = curNum + " ";

            for (int j = i + 1; j < numsArr.length; j++) {
                int nextNum = numsArr[j];
                if (curNum == nextNum) {
                    countEquals ++;
                    curResult += nextNum + " ";
                } else {
                    break;
                }
            }
            if (countEquals > maxSequence) {
                maxSequence = countEquals;
                finalResult = curResult;
            }
        }
        System.out.println(finalResult);
    }
}
