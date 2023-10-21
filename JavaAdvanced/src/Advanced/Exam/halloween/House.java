package Advanced.Exam.halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid kid) {
        if (capacity > data.size()) {
            data.add(kid);
        }
    }

    public boolean removeKid(String name) {
        return data.removeIf(k -> k.getName().equals(name));
    }

    public Kid getKid(String street) {
        return data.stream().filter(k -> k.getStreet().equals(street)).findAny().orElse(null);
    }

    public int getAllKids() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Children who visited a house for candy:\n");
        data.forEach(k -> sb.append(k.getName())
                            .append(" from ")
                            .append(k.getStreet())
                            .append(" street\n"));
        return sb.toString();
    }
}
