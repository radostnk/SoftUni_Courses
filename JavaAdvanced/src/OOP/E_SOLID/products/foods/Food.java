package OOP.E_SOLID.products.foods;

import OOP.E_SOLID.products.Product;

public abstract class Food implements Product {
    private double caloriesPer100Grams;
    private double grams;

    public Food(double grams, double caloriesPer100Grams) {
        this.grams = grams;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    public double getGrams() {
        return grams;
    }

    public double getCaloriesPer100Grams() {
        return caloriesPer100Grams;
    }

    @Override
    public double getKilograms() {
        return this.getGrams() * 1000;
    }

    @Override
    public double getCalories() {
        return (this.getCaloriesPer100Grams() / 100) * grams;
    }
}
