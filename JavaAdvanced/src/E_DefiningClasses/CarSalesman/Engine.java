package E_DefiningClasses.CarSalesman;

public class Engine {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;
    //displacements, and efficiency are option


    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, String displacement) {
        this(model, power);
        this.displacement = displacement;
    }

//    public Engine(String model, int power, String efficiency) {
//        this(model, power);
//        this.efficiency = efficiency;
//    }

    public Engine(String model, int power, String displacement, String efficiency) {
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
