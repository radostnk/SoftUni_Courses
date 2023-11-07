package OOP.E_SOLID.calculators;

import OOP.E_SOLID.products.Product;

import java.util.List;

public interface Calculator {

    double sum(List<Product> products);
    double average(List<Product> products);
}
