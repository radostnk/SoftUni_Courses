package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numsList = new ArrayList<>(Arrays.stream(scan.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            int element = Integer.parseInt(input[1]);

            if (input[0].equals("Delete")) {
                numsList.removeAll(Arrays.asList(element));

            } else if (input[0].equals("Insert")) {
                int index = Integer.parseInt(input[2]);

                numsList.add(index, element);
            }
            command = scan.nextLine();
        }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
