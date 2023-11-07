package OOP.E_SOLID.products.drinks;

import OOP.E_SOLID.products.Product;

public abstract class Drink implements Product {

    private double caloriesPer100Grams;
    private double density;
    private double milliliters;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.density = density;
    }

    public double getMilliliters() {
        return milliliters;
    }

    public double getCaloriesPer100Grams() {
        return caloriesPer100Grams;
    }

    public double getDensity() {
        return density;
    }

    public double getLiters() {
        return this.getMilliliters() * 1000;
    }

    @Override
    public double getKilograms() {
        return this.getLiters() * this.getDensity();
    }

    @Override
    public double getCalories() {
        double grams = this.getMilliliters() * this.getDensity();
        return (this.caloriesPer100Grams / 100) * grams;
    }
}
