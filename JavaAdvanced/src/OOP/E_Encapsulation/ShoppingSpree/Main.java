package OOP.E_Encapsulation.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Person> peopleMap = new LinkedHashMap<>();
        LinkedHashMap<String, Product> productsMap = new LinkedHashMap<>();

        Person person = null;
        Product product = null;

        String[] peopleInput = scan.nextLine().split(";");

        for (int i = 0; i < peopleInput.length; i++) {
            String[] curPerson = peopleInput[i].split("=");
            String personName = curPerson[0];
            double money = Double.parseDouble(curPerson[1]);

            try {
                person = new Person(personName, money);
                peopleMap.put(personName, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productsInput = scan.nextLine().split(";");

        for (int i = 0; i < productsInput.length; i++) {
            String[] curProduct = productsInput[i].split("=");
            String productName = curProduct[0];
            double cost = Double.parseDouble(curProduct[1]);

            try {
                product = new Product(productName, cost);
                productsMap.put(productName, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scan.nextLine();

        while (!command.equals("END")) {
            String[] commandArr = command.split(" ");
            String personName = commandArr[0];
            String productName = commandArr[1];

            Person buyer = peopleMap.get(personName);
            Product boughtProduct = productsMap.get(productName);

            try {
                buyer.buyProduct(boughtProduct);
                System.out.printf("%s bought %s\n", personName, productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scan.nextLine();
        }

        peopleMap.values().forEach(System.out::println);
    }
}
