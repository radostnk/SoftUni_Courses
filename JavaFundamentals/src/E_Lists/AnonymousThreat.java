package E_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        String input = scan.nextLine();

        while (!input.equals("3:1")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {

                case "merge":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);

                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > inputList.size() - 1) {
                        endIndex = inputList.size() - 1;
                    }

                    if (startIndex <= inputList.size() - 1 && endIndex >= 0) {
                        String mergedResult = "";

                        for (int i = startIndex; i <= endIndex; i++) {
                            mergedResult += inputList.get(i);
                        }

                        for (int i = startIndex; i <= endIndex; i++) {
                            inputList.remove(startIndex);
                        }

                        inputList.add(startIndex, mergedResult);
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(commandArr[1]);
                    int partitions = Integer.parseInt(commandArr[2]);
                    String elementToDivide = inputList.get(index);
                    inputList.remove(index);
                    int partsNumber = elementToDivide.length() / partitions;

                    int beginIndex = 0;

                    for (int i = 1; i < partitions; i++) {
                        inputList.add(index, elementToDivide.substring(beginIndex, beginIndex + partsNumber));
                        beginIndex += partsNumber;
                        index ++;
                    }

                    inputList.add(index, elementToDivide.substring(beginIndex));
                    
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(inputList.toString().replaceAll("[\\[\\],]", ""));
    }
}
