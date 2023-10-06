package E_IteratorsAndComparators.ListyIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ListyIterator items = new ListyIterator();

        while (!input[0].equals("END")) {
            String command = input[0];

            switch (command) {
                case "Create":
                    String[] inputItems = new String[input.length - 1];

                    for (int i = 1; i < input.length; i++) {
                        inputItems[i-1] = input[i];
                    }

                    items = new ListyIterator(inputItems);

                    break;

                case "Move":
                    System.out.println(items.move());
                    break;

                case "HasNext":
                    System.out.println(items.hasNext());
                    break;

                case "Print":
                    items.print();
                    break;

                case "PrintAll":
                    items.printAll();
                    break;
            }

            input = scan.nextLine().split(" ");
        }
    }
}
