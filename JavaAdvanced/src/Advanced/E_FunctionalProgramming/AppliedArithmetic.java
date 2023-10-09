package Advanced.E_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numsList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());;

        UnaryOperator<List<Integer>> addFunc = nums -> nums.stream().map(num -> num + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyFunc = nums -> nums.stream().map(num -> num * 2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractFunc = nums -> nums.stream().map(num -> num - 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = nums -> nums.forEach(el -> System.out.printf("%d ", el));

        String command = scan.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    numsList = addFunc.apply(numsList);
                    break;

                case "multiply":
                    numsList = multiplyFunc.apply(numsList);
                    break;

                case "subtract":
                    numsList = subtractFunc.apply(numsList);
                    break;

                case "print":
                    print.accept(numsList);
                    System.out.println();
                    break;

            }

            command = scan.nextLine();
        }
    }
}

// "add" -> adds 1;
// "multiply" -> multiplies by 2;
// "subtract" -> subtracts 1;
// "print" -> prints all numbers on a new line