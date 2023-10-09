package Advanced.L_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UnaryOperator<Double> addVAT = num -> num * 1.2;
        Consumer<Double> formatter = num -> System.out.printf("%.2f\n", num);

        System.out.println("Prices with VAT:");

        Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVAT)
                .forEach(formatter);

    }
}
