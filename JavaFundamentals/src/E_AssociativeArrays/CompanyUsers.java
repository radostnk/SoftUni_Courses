package E_AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        LinkedHashMap<String, ArrayList<String>> companiesMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" -> ");
            String companyName = inputArr[0];
            String employeeId = inputArr[1];

            if (!companiesMap.containsKey(companyName)) {
                companiesMap.put(companyName, new ArrayList<>());
                companiesMap.get(companyName).add(employeeId);
            } else if (!companiesMap.get(companyName).contains(employeeId)) {
                companiesMap.get(companyName).add(employeeId);
            }

            input = scan.nextLine();
        }

        companiesMap.forEach((companyName,employeeIds) -> {
                    System.out.println(companyName);
                    employeeIds.forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
//SoftUni
//-- AA12345
//-- BB12345