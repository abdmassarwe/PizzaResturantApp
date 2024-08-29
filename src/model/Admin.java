package model;


public class Admin extends Employee {
	

	public Admin(String id, String firstName, String lastName, String phoneNumber, String address, double workHours,
			EmployeeRole role, double hourlySalary) {
		super(id, firstName, lastName, phoneNumber, address, workHours, role, hourlySalary);
	}
}
