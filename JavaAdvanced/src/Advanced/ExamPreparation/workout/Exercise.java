package Advanced.ExamPreparation.workout;

public class Exercise {
    private String name;
    private String muscle;
    private int burnedCalories;

    public Exercise(String name, String muscle, int burnedCalories) {
        this.name = name;
        this.muscle = muscle;
        this.burnedCalories = burnedCalories;
    }

    public String toString() {
        return String.format("Exercise: %s, %s, %d\n", this.getName(), this.getMuscle(), this.getBurnedCalories());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle() {
        return muscle;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }
}