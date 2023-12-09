package harpoonDiver_exam.models.diver;

import harpoonDiver_exam.models.seaCatch.BaseSeaCatch;
import harpoonDiver_exam.models.seaCatch.SeaCatch;

import static harpoonDiver_exam.common.ConstantMessages.*;
import static harpoonDiver_exam.common.ExceptionMessages.DIVER_NAME_NULL_OR_EMPTY;
import static harpoonDiver_exam.common.ExceptionMessages.DIVER_OXYGEN_LESS_THAN_ZERO;

public abstract class BaseDiver implements Diver {

    private String name;
    private double oxygen;
    private SeaCatch seaCatch;

    public BaseDiver(String name, double oxygen) {
        this.setName(name);
        this.setOxygen(oxygen);
        this.seaCatch = new BaseSeaCatch();
    }

    private void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(DIVER_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    private void setOxygen(double oxygen) {

        if (oxygen < 0) {
            throw new IllegalArgumentException(DIVER_OXYGEN_LESS_THAN_ZERO);
        }

        this.oxygen = oxygen;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getOxygen() {
        return oxygen;
    }

    @Override
    public boolean canDive() {
        return oxygen > 0;
    }

    @Override
    public SeaCatch getSeaCatch() {
        return seaCatch;
    }

    @Override
    public void shoot() {
        this.setOxygen(Math.max(getOxygen() - 30, 0));
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(String.format(FINAL_DIVER_NAME, this.getName()));
        sb.append(System.lineSeparator());
        sb.append(String.format(FINAL_DIVER_OXYGEN, this.getOxygen()));
        sb.append(System.lineSeparator());

        if (this.getSeaCatch().getSeaCreatures().isEmpty()) {
            sb.append(String.format(FINAL_DIVER_CATCH, "None"));

        } else {
            sb.append(String.format(FINAL_DIVER_CATCH,
                    String.join(FINAL_DIVER_CATCH_DELIMITER, this.getSeaCatch().getSeaCreatures())));
        }

        return sb.toString();
    }
}

