package E_Generics.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        MyList<String> list = new MyList<>();

        while (!input[0].equals("END")) {
            switch (input[0]) {

                case "Add":
                    list.add(input[1]);
                    break;

                case "Remove":
                    list.remove(Integer.parseInt(input[1]));
                    break;

                case "Contains":
                    System.out.println(list.contains(input[1]));
                    break;

                case "Swap":
                    list.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;

                case "Greater":
                    System.out.println(list.countGreaterThan(input[1]));
                    break;

                case "Max":
                    System.out.println(list.getMax());
                    break;

                case "Min":
                    System.out.println(list.getMin());
                    break;

                case "Sort":
                    Sorter.sort(list);
                    break;

                case "Print":
                    list.print();
                    break;
            }

            input = scan.nextLine().split("\\s+");
        }


    }
}