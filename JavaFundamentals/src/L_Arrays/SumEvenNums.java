package L_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] nums = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
