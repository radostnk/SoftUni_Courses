package E_TextProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder bigNum = new StringBuilder(input);
        int num = Integer.parseInt(scan.nextLine());
        StringBuilder result = new StringBuilder();
        int prevInMind = 0;

        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int curNum = Integer.parseInt(bigNum.substring(i, i + 1));
            int curResult = curNum * num;
            int inMind = 0;

            curResult += prevInMind;

            if (curResult >= 10) {
                inMind = curResult / 10;
                curResult %= 10;
            }

            prevInMind = inMind;

            result.append(curResult);
        }

        if (prevInMind != 0) {
            result.append(prevInMind);
        }

        int zerosCount = 0;

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                zerosCount++;
            }
        }

        boolean trailing = true;
        StringBuilder output = new StringBuilder();

        for (int i = result.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(result.substring(i, i + 1)) == 0 && trailing) {

            } else {
                trailing = false;
                output.append(result.charAt(i));
            }
        }

        if (zerosCount == result.length()) {
            System.out.println(0);
        } else {
            System.out.println(output);
        }
    }
}
