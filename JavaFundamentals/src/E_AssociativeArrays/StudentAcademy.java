package E_AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!studentsMap.containsKey(studentName)) {
                studentsMap.put(studentName, new ArrayList<>());
            }
            studentsMap.get(studentName).add(grade);
        }
        studentsMap.forEach((key, value) -> {
            if (getAverageGrade(value) >= 4.5) {
            System.out.printf("%s -> %.2f\n", key, getAverageGrade(value));
        }});
    }

    public static double getAverageGrade(ArrayList<Double> grades) {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}