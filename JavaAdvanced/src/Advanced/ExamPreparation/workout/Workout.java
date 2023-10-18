package Advanced.ExamPreparation.workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Exercise> exercises;
    private String type;
    private int exerciseCount;

    public Workout(String type, int exerciseCount) {
        this.exercises = new ArrayList<>();
        this.type = type;
        this.exerciseCount = exerciseCount;
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        return exercises.removeIf(el -> el.getName().equals(name) && el.getMuscle().equals(muscle));
    }

    public Exercise getExercise(String name, String muscle) {
        Exercise exercise = null;

        for (Exercise el : exercises) {
            if (el.getName().equals(name) && el.getMuscle().equals(muscle)) {
                exercise = el;
                break;
            }
        }
        return exercise;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        int maxCalories = Integer.MIN_VALUE;
        Exercise toReturn = null;

        for (int i = 0; i < exercises.size(); i++) {
            Exercise ex = exercises.get(i);
            if (ex.getBurnedCalories() > maxCalories) {
                maxCalories = ex.getBurnedCalories();
                toReturn = ex;
            }
        }
        return toReturn;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Workout type: %s\n", this.type));
        exercises.forEach(el -> sb.append(el.toString()));
        return sb.toString();
    }
}
