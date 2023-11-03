package OOP.E_Polymorphism.Vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle implements Refuelable, Drivable {

    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
    }

    @Override
    public String drive(double kilometers) {

        double fuelNeeded = this.getFuelConsumption() * kilometers;
        DecimalFormat df = new DecimalFormat("##.##");

        if (fuelNeeded >= this.getFuelQuantity()) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        } else {
            this.fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(kilometers));
        }
    }

    @Override
    public void refuel(double litres) {
        this.fuelQuantity += litres;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
