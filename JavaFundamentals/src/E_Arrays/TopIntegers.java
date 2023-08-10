package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numsArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numsArr.length; i++) {
            int curNum = numsArr[i];
            boolean isTop = true;

            for (int j = i + 1; j < numsArr.length; j++) {
                int nextNum = numsArr[j];
                if (curNum <= nextNum) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(curNum + " ");
            }
        }
    }
}
