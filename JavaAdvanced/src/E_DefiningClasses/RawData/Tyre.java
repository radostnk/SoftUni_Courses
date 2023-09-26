package E_DefiningClasses.RawData;

public class Tyre {
    private double tyrePressure;
    private int tyreAge;

    public Tyre(double tyrePressure, int tyreAge) {
        this.tyrePressure = tyrePressure;
        this.tyreAge = tyreAge;
    }

    public double getTyrePressure() {
        return tyrePressure;
    }

    public void setTyrePressure(double tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public int getTyreAge() {
        return tyreAge;
    }

    public void setTyreAge(int tyreAge) {
        this.tyreAge = tyreAge;
    }
}
