package OOP.E_Inheritance.animals;

public class Tomcat extends Cat {

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
        this.setGender("Male");
    }

    public String produceSound() {
        return "MEOW";
    }
}
