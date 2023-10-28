package OOP.E_Encapsulation.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pizza pizza = null;
        Dough dough = null;
        Topping topping = null;

        try {
            String[] pizzaInput = scan.nextLine().split(" ");
            String pizzaName = pizzaInput[1];
            int toppingsNum = Integer.parseInt(pizzaInput[2]);
            pizza = new Pizza(pizzaName, toppingsNum);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            String[] doughInput = scan.nextLine().split(" ");
            String doughName = doughInput[1];
            String bakingTechnique = doughInput[2];
            double weightInGrams = Double.parseDouble(doughInput[3]);

            dough = new Dough(doughName, bakingTechnique, weightInGrams);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        String input = scan.nextLine();

        while (!input.equals("END")) {
            try {
                String[] toppingInput = input.split(" ");
                String toppingType = toppingInput[1];
                double weightInGrams = Double.parseDouble(toppingInput[2]);

                topping = new Topping(toppingType, weightInGrams);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("%s - %.2f\n", pizza.getName(), pizza.getOverallCalories());
    }
}
