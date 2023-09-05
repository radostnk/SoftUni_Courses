package E_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] sizes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sizeOne = sizes[0];
        int sizeTwo = sizes[1];

        LinkedHashSet<Integer> setOne = new LinkedHashSet<>();
        LinkedHashSet<Integer> setTwo = new LinkedHashSet<>();

        for (int i = 0; i < sizeOne; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            setOne.add(curNum);
        }

        for (int i = 0; i < sizeTwo; i++) {
            int curNum = Integer.parseInt(scan.nextLine());
            setTwo.add(curNum);
        }

//        for (int elOne : setOne) {
//            if (setTwo.contains(elOne)) {
//                System.out.printf("%d ", elOne);
//            }
//        }

        setOne.retainAll(setTwo);
        setOne.forEach(el -> System.out.printf("%d ", el));
    }
}
