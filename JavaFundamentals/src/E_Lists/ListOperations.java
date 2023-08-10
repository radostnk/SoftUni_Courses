package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        String command = scan.nextLine();

        while (!command.equals("End")) {

            String[] input = command.split(" ");
            String commandType = input[0];

            switch (commandType) {

                case "Add":
                    numsList.add(Integer.parseInt(input[1]));
                    break;

                case "Insert":
                    int indexToInsert = Integer.parseInt(input[2]);

                    if (indexToInsert > numsList.size() || indexToInsert < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numsList.add(indexToInsert, Integer.parseInt(input[1]));
                    }

                    break;

                case "Remove":
                    int indexToRmv = Integer.parseInt(input[1]);

                    if (indexToRmv > numsList.size() - 1 || indexToRmv < 0) {
                        System.out.println("Invalid index");
                    } else {
                        numsList.remove(indexToRmv);
                    }

                    break;

                case "Shift":
                    int shiftsCount = Integer.parseInt(input[2]);

                    if (input[1].equals("left")) {
                        for (int i = 1; i <= shiftsCount; i++) {
                            int firstElement = numsList.get(0);
                            numsList.remove(0);
                            numsList.add(firstElement);
                        }

                    } else if (input[1].equals("right")) {
                        for (int i = 1; i <= shiftsCount; i++) {
                            int lastElement = numsList.get(numsList.size() - 1);
                            numsList.add(0, lastElement);
                            numsList.remove(numsList.size() - 1);
                        }
                    }

                    break;
            }
            command = scan.nextLine();
        }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
