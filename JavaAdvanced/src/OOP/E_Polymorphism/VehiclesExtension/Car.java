package OOP.E_Polymorphism.VehiclesExtension;

public class Car extends Vehicle {

    public static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption + ADDITIONAL_CONSUMPTION;
    }
}
