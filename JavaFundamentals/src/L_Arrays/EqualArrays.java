package L_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arrOne = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arrTwo = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean areEqual = true;
        int sum = 0;
        int index = 0;

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == arrTwo[i]) {
                sum += arrOne[i];
            } else {
                areEqual = false;
                index = i;
                break;
            }
        }
        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
