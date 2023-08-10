package L_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] inputArr = command.split(" ");
            int num = Integer.parseInt(inputArr[1]);

            switch (inputArr[0]) {
                case "Add":
                    numsList.add(num);
                    break;

                case "Remove":
                    numsList.remove(Integer.valueOf(num));
                    break;

                case "RemoveAt":
                    numsList.remove(num);
                    break;

                case "Insert":
                    int index = Integer.parseInt(inputArr[2]);
                    numsList.add(index, num);
                    break;
            }
            command = scan.nextLine();
        }

        for(int element : numsList) {
            System.out.print(element + " ");
        }
    }
}