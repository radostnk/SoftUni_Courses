package L_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        List<Integer> secondList = new ArrayList<>(Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        int smallerList = smallerListSize(firstList, secondList);

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < smallerList; i++) {
            newList.add(firstList.get(i));
            newList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            newList.addAll(firstList.subList(smallerList, firstList.size()));
        } else if (firstList.size() < secondList.size()) {
            newList.addAll(secondList.subList(smallerList, secondList.size()));
        }

        System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static int smallerListSize(List<Integer> firstList, List<Integer> secondList) {
        if (firstList.size() < secondList.size()) {
            return firstList.size();
        } else {
            return secondList.size();
        }
    }
}
