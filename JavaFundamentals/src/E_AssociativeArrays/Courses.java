package E_AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();
        String command = scan.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" : ");
            String course = input[0];
            String student = input[1];

            if (!coursesMap.containsKey(course)) {
                coursesMap.put(course, new ArrayList<>());
            }
            coursesMap.get(course).add(student);

            command = scan.nextLine();
        }

        coursesMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(student -> System.out.printf("-- %s\n", student));
        });
    }
}
