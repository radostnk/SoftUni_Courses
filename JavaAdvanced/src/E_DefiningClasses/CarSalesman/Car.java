package E_DefiningClasses.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }
    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }
    public Car(String model, Engine engine, int weight, String color) {
        this(model, engine, weight);
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getModel()).append(":\n");
        sb.append(this.getEngine().getModel()).append(":\n");
        sb.append(String.format("Power: %d\n", this.getEngine().getPower()));

        if (this.getEngine().getDisplacement() == 0) {
            sb.append("Displacement: n/a\n");
        } else {
            sb.append(String.format("Displacement: %d\n", this.getEngine().getDisplacement()));
        }

        sb.append(String.format("Efficiency: %s\n", this.getEngine().getEfficiency()));

        if (this.getWeight() == 0) {
            sb.append("Weight: n/a\n");
        } else {
            sb.append(String.format("Weight: %d\n", this.getWeight()));
        }

        sb.append(String.format("Color: %s", this.getColor()));

        return sb.toString();
    }
}

//"{CarModel}:
//{EngineModel}:
//Power: {EnginePower}
//Displacement: {EngineDisplacement} ***
//Efficiency: {EngineEfficiency}
//Weight: {CarWeight} ***
//Color: {CarColor}"