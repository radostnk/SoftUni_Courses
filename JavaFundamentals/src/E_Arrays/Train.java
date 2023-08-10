package E_Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] peopleArr = new int[n];
        int peopleTotal = 0;

        for (int i = 0; i < peopleArr.length; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            peopleArr[i] = curNum;
        }

        for (int i : peopleArr) {
            peopleTotal += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(peopleTotal);
    }
}