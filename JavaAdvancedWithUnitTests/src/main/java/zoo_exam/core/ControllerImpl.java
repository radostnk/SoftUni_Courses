package zoo_exam.core;

import zoo_exam.entities.animals.Animal;
import zoo_exam.entities.animals.AquaticAnimal;
import zoo_exam.entities.animals.TerrestrialAnimal;
import zoo_exam.entities.areas.Area;
import zoo_exam.entities.areas.LandArea;
import zoo_exam.entities.areas.WaterArea;
import zoo_exam.entities.foods.Food;
import zoo_exam.entities.foods.Meat;
import zoo_exam.entities.foods.Vegetable;
import zoo_exam.repositories.FoodRepository;
import zoo_exam.repositories.FoodRepositoryImpl;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import static zoo_exam.common.ConstantMessages.*;
import static zoo_exam.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {

    private FoodRepository foodRepository;
    private Map<String, Area> areas;

    public ControllerImpl() {
        this.foodRepository = new FoodRepositoryImpl();
        this.areas = new LinkedHashMap<>();
    }

    @Override
    public String addArea(String areaType, String areaName) {

        Area area = null;

        switch (areaType) {
            case "LandArea":
                area = new LandArea(areaName);
                break;

            case "WaterArea":
                area = new WaterArea(areaName);
                break;

            default:
                throw new NullPointerException(INVALID_AREA_TYPE);

        }

        areas.put(areaName, area);
        return String.format(SUCCESSFULLY_ADDED_AREA_TYPE, areaType);
    }

    @Override
    public String buyFood(String foodType) {
        Food food;

        switch (foodType) {
            case "Vegetable":
                food = new Vegetable();
                break;

            case "Meat":
                food = new Meat();
                break;

            default:
                throw new IllegalArgumentException(INVALID_FOOD_TYPE);
        }

        foodRepository.add(food);
        return String.format(SUCCESSFULLY_ADDED_FOOD_TYPE, foodType);
    }

    @Override
    public String foodForArea(String areaName, String foodType) {
        Food food = foodRepository.findByType(foodType);
        Area area = areas.get(areaName);

        if (food == null) {
            throw new IllegalArgumentException(String.format(NO_FOOD_FOUND, foodType));
        }

        area.addFood(food);
        foodRepository.remove(food);
        return String.format(SUCCESSFULLY_ADDED_FOOD_IN_AREA, foodType, areaName);
    }

    @Override
    public String addAnimal(String areaName, String animalType, String animalName, String kind, double price) {
        Area area = areas.get(areaName);
        Animal animal = null;

        switch (animalType) {
            case "TerrestrialAnimal":
                animal = new TerrestrialAnimal(animalName, kind, price);
                break;

            case "AquaticAnimal":
                animal = new AquaticAnimal(animalName, kind, price);
                break;

            default:
                throw new IllegalArgumentException(INVALID_ANIMAL_TYPE);
        }

        String areaActualType = area.getClass().getSimpleName();

        if (areaActualType.equals("LandArea") && animalType.equals("TerrestrialAnimal")
                || areaActualType.equals("WaterArea") && animalType.equals("AquaticAnimal")) {
            area.addAnimal(animal);

        } else {
            return AREA_NOT_SUITABLE;
        }

        return String.format(SUCCESSFULLY_ADDED_ANIMAL_IN_AREA, animalType, areaName);

    }

    @Override
    public String feedAnimal(String areaName) {
        Area area = areas.get(areaName);
        area.feed();
        return String.format(ANIMALS_FED, area.getAnimals().size());
    }

    @Override
    public String calculateKg(String areaName) {
        Collection<Animal> animals = areas.get(areaName).getAnimals();
        double sum = animals.stream().mapToDouble(Animal::getKg).sum();

        return String.format(KILOGRAMS_AREA, areaName, sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        areas.values().forEach(a -> sb.append(a.getInfo()));
        return sb.toString();
    }
}
