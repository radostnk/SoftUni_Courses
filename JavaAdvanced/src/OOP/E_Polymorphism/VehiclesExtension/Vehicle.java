package OOP.E_Polymorphism.VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle implements Refuelable, Drivable {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected int tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
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
        double newLitres = this.getFuelQuantity() + litres;

        if (newLitres > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

        if (litres <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.setFuelQuantity(newLitres);
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
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
