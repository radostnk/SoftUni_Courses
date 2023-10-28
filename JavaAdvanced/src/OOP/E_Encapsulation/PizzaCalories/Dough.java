package OOP.E_Encapsulation.PizzaCalories;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        List<String> floursList = Arrays.asList("White", "Wholegrain");

        if (!floursList.contains(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        List<String> bakingList = Arrays.asList("Crispy", "Chewy", "Homemade");

        if (!bakingList.contains(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        HashMap<String, Double> modifiers = getModifierMap();
        return this.weight * 2 * modifiers.get(this.bakingTechnique) * modifiers.get(this.flourType);
    }

    private HashMap<String, Double> getModifierMap() {
        HashMap<String, Double> modifiers = new HashMap<>();
        modifiers.put("White", 1.5);
        modifiers.put("Wholegrain", 1.0);
        modifiers.put("Crispy", 0.9);
        modifiers.put("Chewy", 1.1);
        modifiers.put("Homemade", 1.0);

        return modifiers;
    }
}
