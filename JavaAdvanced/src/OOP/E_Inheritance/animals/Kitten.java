package OOP.E_Inheritance.animals;

public class Kitten extends Cat {

    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
        this.setGender("Female");
    }

    public String produceSound() {
        return "Meow";
    }
}
