package Advanced.ExamPreparation.easterBasket;

public class Egg {
    private String color;
    private int strength;
    private String shape;

    public Egg(String color, int strength, String shape) {
        this.color = color;
        this.strength = strength;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return String.format("%s egg, with %d strength and %s shape.\n", this.color, this.strength, this.shape);
    }
}