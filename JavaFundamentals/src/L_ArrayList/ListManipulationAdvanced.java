package L_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] inputArr = command.split(" ");

            switch (inputArr[0]) {
                case "Contains":

                    int num = Integer.parseInt(inputArr[1]);
                    if (numsList.contains(num)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }

                    break;

                case "Print":

                    if (inputArr[1].equals("even")) {
                        printEvenNums(numsList);
                    } else if (inputArr[1].equals("odd")){
                        printOddNums(numsList);
                    }

                    break;

                case "Get":

                    printSum(numsList);
                    break;

                case "Filter":

                    String condition = inputArr[1];
                    int condNum = Integer.parseInt(inputArr[2]);

                    List<Integer> filteredList = filterList(numsList, condition, condNum);
                    System.out.println(filteredList.toString().replaceAll("[\\[\\],]", ""));

                    break;
            }
            command = scan.nextLine();
        }
    }

    public static void printEvenNums(List<Integer> numsList) {
        for (int num : numsList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNums(List<Integer> numsList) {
        for (int num : numsList) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printSum(List<Integer> numsList) {
        int sum = 0;

        for (int num : numsList) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static List<Integer> filterList(List<Integer> numsList, String condition, int num) {
        List<Integer> filteredNumsList = new ArrayList<>();

        switch (condition) {
            case "<":

                for (int element : numsList) {
                    if (element < num) {
                        filteredNumsList.add(element);
                    }
                }

                break;

            case ">":

                for (int element : numsList) {
                    if (element > num) {
                        filteredNumsList.add(element);
                    }
                }

                break;

            case "<=":

                for (int element : numsList) {
                    if (element <= num) {
                        filteredNumsList.add(element);
                    }
                }

                break;

            case ">=":

                for (int element : numsList) {
                    if (element >= num) {
                        filteredNumsList.add(element);
                    }
                }

                break;
        }
        return filteredNumsList;
    }

}