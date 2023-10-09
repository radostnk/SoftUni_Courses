package Advanced.L_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();

        while (decimal > 0) {
            int left = decimal % 2;
            binary.push(left);
            decimal /= 2;
        }

        if (binary.isEmpty()) {
            System.out.print("0");
        }

//        binary.forEach(item -> System.out.print(item));

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}

//10%2=0
//5%2=1
//2%2=0
//1%2=1
//0
//binary=1010