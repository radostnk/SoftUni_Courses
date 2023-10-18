package Advanced.ExamPreparation.easterBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (data.size() < this.capacity) {
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        return data.removeIf(el -> el.getColor().equals(color));
    }

    public Egg getStrongestEgg() {
        Egg strongestEgg = null;
        int greatestStrength = Integer.MIN_VALUE;

        for (Egg egg : data) {
            if (egg.getStrength() > greatestStrength) {
                greatestStrength = egg.getStrength();
                strongestEgg = egg;
            }
        }
        return strongestEgg;
    }

    public Egg getEgg(String color) {
        Egg returnEgg = null;
        for (Egg egg : data) {
            if (egg.getColor().equals(color)) {
                returnEgg = egg;
            }
        }
        return returnEgg;
    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.material).append(" basket contains: \n");
        data.forEach(egg -> sb.append(egg.toString()));

        return sb.toString();
    }
}