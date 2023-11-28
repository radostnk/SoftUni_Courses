package zoo_exam.entities.animals;

public class AquaticAnimal extends BaseAnimal {

    private static final double KG = 2.5;

    public AquaticAnimal(String name, String kind, double price) {
        super(name, kind, KG, price);
    }

    @Override
    public void eat() {
        this.setKg(this.getKg() + 7.5);
    }
}
