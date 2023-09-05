package E_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
//            String[] curInput = scan.nextLine().split(" ");
//            for (String el : curInput) {
//                set.add(el);
//            }

            set.addAll(Arrays.asList(scan.nextLine().split(" ")));
        }

        set.forEach(el -> System.out.printf("%s ", el));
    }
}
