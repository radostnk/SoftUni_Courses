package OOP.E_SOLID.calculators;

import OOP.E_SOLID.products.Product;

import java.util.List;

public class WeightCalculator implements Calculator {

    @Override
    public double sum(List<Product> products) {
        return products.stream().mapToDouble(Product::getKilograms).sum();
    }

    @Override
    public double average(List<Product> products) {
        return products.stream().mapToDouble(Product::getKilograms).average().getAsDouble();
    }
}
