package OOP.E_Polymorphism.VehiclesExtension;

public class Bus extends Vehicle {

    public static final double ADDITIONAL_CONSUMPTION = 1.4;
    protected boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = true;
    }

    public void setEmpty(boolean curIsEmpty) {

        if (this.isEmpty == curIsEmpty) {
            return;
        }

        if (this.isEmpty && !curIsEmpty) {
            super.setFuelConsumption(fuelConsumption + ADDITIONAL_CONSUMPTION);
        }

        if (!this.isEmpty && curIsEmpty) {
            super.setFuelConsumption(fuelConsumption - ADDITIONAL_CONSUMPTION);
        }

        this.isEmpty = curIsEmpty;
    }


}
