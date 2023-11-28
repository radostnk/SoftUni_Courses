package zoo_exam.entities.areas;

import zoo_exam.entities.animals.Animal;
import zoo_exam.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static zoo_exam.common.ExceptionMessages.*;

public abstract class BaseArea implements Area {

    private String name;
    private int capacity;
    private Collection<Food> foods;
    private Collection<Animal> animals;

    public BaseArea(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.foods = new ArrayList<>();
        this.animals = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(AREA_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return this.animals;
    }

    @Override
    public Collection<Food> getFoods() {
        return this.foods;
    }

    @Override
    public int sumCalories() {
        return foods.stream().mapToInt(Food::getCalories).sum();
    }

    @Override
    public void addAnimal(Animal animal) {
        if (this.capacity <= this.animals.size()) {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }

        animals.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void addFood(Food food) {
        foods.add(food);
    }

    @Override
    public void feed() {
        animals.forEach(Animal::eat);
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s):\n", this.getName(), this.getClass().getSimpleName()))
                .append("Animals: ");

        if (animals.isEmpty()) {
            sb.append("none\n");

        } else {
            sb.append(String.join(" ",
                    animals.stream()
                        .map(Animal::getName)
                        .collect(Collectors.toList())));
            sb.append("\n");
        }

        sb.append(String.format("Foods: %d\n", foods.size()))
                .append(String.format("Calories: %d", this.sumCalories()));

        return sb.toString();
    }
}
