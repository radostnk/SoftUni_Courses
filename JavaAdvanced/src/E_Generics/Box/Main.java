package E_Generics.Box;

import E_Generics.Box.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box<String> box = new Box<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            box.add(input);
        }

//        String[] swapIndices = scan.nextLine().split(" ");
//        int firstIndex = Integer.parseInt(swapIndices[0]);
//        int secondIndex = Integer.parseInt(swapIndices[1]);
//        box.swap(firstIndex, secondIndex);

        String comparator = scan.nextLine();
        System.out.println(box.countLargerElements(comparator));


//        System.out.println(box.toString());
    }
}
