package E_ObjectsAndClasses.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentsList.add(student);
        }
        Collections.sort(studentsList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentsList) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
