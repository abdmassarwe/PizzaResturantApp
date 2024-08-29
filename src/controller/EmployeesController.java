package controller;

import java.util.HashMap;
import java.util.Map;

import model.Employee;

public class EmployeesController {
    private Map<String, Employee> employees;

    public EmployeesController() {
        this.employees = new HashMap<>();
    }

    public boolean addEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            System.out.println("Employee with ID: " + employee.getId() + " already exists.");
            return false;
        }
        employees.put(employee.getId(), employee);
        System.out.println("Employee: " + employee.getId() + " has been successfully added.");
        return true;
    }

    public boolean deleteEmployee(String employeeId) {
        if (employees.containsKey(employeeId)) {
            employees.remove(employeeId);
            System.out.println("Employee: " + employeeId + " has been successfully removed.");
            return true;
        }
        System.out.println("Employee: " + employeeId + " could not be found.");
        return false;
    }

    public boolean updateEmployee(Employee employee) {
        if (employees.containsKey(employee.getId())) {
            employees.put(employee.getId(), employee);
            System.out.println("Employee: " + employee.getId() + " has been successfully updated.");
            return true;
        }
        System.out.println("Employee: " + employee.getId() + " could not be found.");
        return false;
    }

    public Employee getEmployeeById(String employeeId) {
        return employees.get(employeeId);
    }

    public Map<String, Employee> getAllEmployees() {
        return new HashMap<>(employees);  // Return a copy to prevent external modification
    }
}
