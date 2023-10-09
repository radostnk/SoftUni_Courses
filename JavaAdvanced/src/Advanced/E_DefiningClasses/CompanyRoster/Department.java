package Advanced.E_DefiningClasses.CompanyRoster;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employeesList;

    public Department(String departmentName, List<Employee> employeesList) {
        this.departmentName = departmentName;
        this.employeesList = employeesList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public double averageSalary() {
        return employeesList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }
}
