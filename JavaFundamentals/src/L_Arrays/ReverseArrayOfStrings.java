package L_Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArr = scan.nextLine().split(" ");

   //     for (int i = strArr.length - 1; i >= 0 ; i--) {
   //         System.out.print(strArr[i] + " ");
   //     }

        for (int i = 0; i < strArr.length / 2; i++) {
            String curStr = strArr[i];
            strArr[i] = strArr[strArr.length - 1 - i];
            strArr[strArr.length - 1 - i] = curStr;
        }
        System.out.println(String.join(" ", strArr));
    }
}
