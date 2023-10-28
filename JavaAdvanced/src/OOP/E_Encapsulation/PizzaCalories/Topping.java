package OOP.E_Encapsulation.PizzaCalories;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }
    private void setToppingType(String toppingType) {
            List<String> toppingsList = Arrays.asList("Meat", "Veggies", "Cheese", "Sauce");

        if (!toppingsList.contains(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        HashMap<String, Double> modifiers = getModifierMap();
        return this.weight * 2 * modifiers.get(this.toppingType);
    }

    private HashMap<String, Double> getModifierMap() {
        HashMap<String, Double> modifiers = new HashMap<>();
        modifiers.put("Meat", 1.2);
        modifiers.put("Veggies", 0.8);
        modifiers.put("Cheese", 1.1);
        modifiers.put("Sauce", 0.9);

        return modifiers;
    }
}