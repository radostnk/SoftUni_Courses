package Advanced.L_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, List<Double>> gradesMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = scan.nextLine();
            gradesMap.put(student, Arrays
                    .stream(scan.nextLine().split(" "))
                            .map(Double::parseDouble)
                            .collect(Collectors.toList()));
        }

        gradesMap.forEach((student, grades) -> {
            double average = 0;
            for (double grade : gradesMap.get(student)) {
                average += grade;
            }
            average /= grades.size();

            System.out.println(student + " is graduated with " + average);
        });
    }
}
