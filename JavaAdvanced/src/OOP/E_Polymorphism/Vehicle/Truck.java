package OOP.E_Polymorphism.Vehicle;

public class Truck extends Vehicle {

    public static final double ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public void refuel(double litres) {
        super.refuel(0.95 * litres);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption + ADDITIONAL_CONSUMPTION;
    }
}
