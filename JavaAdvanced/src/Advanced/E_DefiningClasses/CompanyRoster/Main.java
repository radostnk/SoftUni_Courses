package Advanced.E_DefiningClasses.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Department> departmenstMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            Employee emp = null;

            switch (input.length) {
                case 4:
                    emp = new Employee(name, salary, position, department);
                    break;

                case 6:
                    String email = input[4];
                    int age = Integer.parseInt(input[5]);

                     emp = new Employee(name, salary, position, department, email, age);
                    break;

                case 5:
                    if (input[4].contains("@")) {
                        String emailOnly = input[4];
                        emp = new Employee(name, salary, position, department, emailOnly);
                    } else {
                        int ageOnly = Integer.parseInt(input[4]);
                        emp = new Employee(name, salary, position, department, ageOnly);
                    }
                    break;
            }

            departmenstMap.putIfAbsent(department, new Department(department, new ArrayList<>()));
            departmenstMap.get(department).getEmployeesList().add(emp);
        }
        Department highestSalaryDepartment = departmenstMap.entrySet().stream()
                .max(Comparator.comparingDouble(e -> e.getValue().averageSalary()))
                .get().getValue();

        System.out.println("Highest Average Salary: " + highestSalaryDepartment.getDepartmentName());
        departmenstMap.get(highestSalaryDepartment.getDepartmentName()).getEmployeesList()
                .stream()
                .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
    }
}
