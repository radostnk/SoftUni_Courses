package Advanced.ExamPreparation.hotel;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Person> roster;
    private String name;
    private int capacity;

    public Hotel(String name, int capacity) {
        roster = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public void add(Person person) {
        if (roster.size() < capacity) {
            roster.add(person);
        }
    }

    public boolean remove(String name) {
        return roster.removeIf(p -> p.getName().equals(name));
    }

    public Person getPerson(String name, String hometown) {
        return roster.stream()
                .filter(p -> p.getName().equals(name) && p.getHometown().equals(hometown))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return roster.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The people in the ExamPreparation.hotel %s are:\n", this.name));
        roster.forEach(p -> sb.append(p.toString())
                .append("\n"));

        return sb.toString();
    }


}