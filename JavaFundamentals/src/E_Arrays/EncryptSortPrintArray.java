package E_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] allSumsArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] inputArr = scan.nextLine().split("");
            int sum = 0;

            for (int j = 0; j < inputArr.length; j++) {
                char curSymbol = inputArr[j].charAt(0);

                if (isVowel(curSymbol)) {
                    sum += (int) curSymbol * inputArr.length;
                } else {
                    sum += (int) curSymbol / inputArr.length;
                }
            }
            allSumsArr[i] = sum;
        }
        int[] allSumsSorted = Arrays.stream(allSumsArr).sorted().toArray();

        for (int sum : allSumsSorted) {
            System.out.println(sum);
        }
    }

    public static boolean isVowel(char c) {
        String vowels = "aoueiAOUEI";
        return vowels.indexOf(c) != -1;
    }
}