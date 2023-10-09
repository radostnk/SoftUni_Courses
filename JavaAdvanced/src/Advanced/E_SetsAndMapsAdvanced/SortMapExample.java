package Advanced.E_SetsAndMapsAdvanced;

import java.util.HashMap;

public class SortMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Asen", 3);
        map.put("Toshko", 4);
        map.put("Plamen", 2);
        map.put("Petar", 2);
        map.put("Toma", 6);
        map.put("Boyan", 3);

        map.entrySet().stream().sorted((left, right) -> {
            //first sort rule - by grade descending
            int result = 0;
            result = right.getValue() - left.getValue();

            //second sort rule - by name descending
            if (result == 0) {
                result = left.getKey().compareTo(right.getKey());
            }

            return result;

        }).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
