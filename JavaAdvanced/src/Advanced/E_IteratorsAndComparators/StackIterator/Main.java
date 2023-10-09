package Advanced.E_IteratorsAndComparators.StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Stack myStack = new Stack();

        while (!input.equals("END")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            switch (command) {
                case "Push":

                    for (int i = 1; i < inputArr.length; i++) {
                        myStack.push(Integer.parseInt(inputArr[i].replaceAll(",","")));
                    }

                    break;

                case "Pop":

                    if (myStack.isNotEmpty()) {
                        myStack.pop();
                    } else {
                        System.out.println("No elements");
                    }

                    break;
            }
            input = scan.nextLine();
        }

        if (myStack.isNotEmpty()) {
            myStack.forEach(System.out::println);
            myStack.forEach(System.out::println);
        }
    }
}