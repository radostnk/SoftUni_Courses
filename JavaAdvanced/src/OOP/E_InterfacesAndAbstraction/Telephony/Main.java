package OOP.E_InterfacesAndAbstraction.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> numbersList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> urlsList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());


        Smartphone phone = new Smartphone(numbersList, urlsList);
        System.out.print(phone.call());
        System.out.print(phone.browse());
    }
}
