package model;

public class Employee extends Person{
	
	private final double taxPercent = 17.5;
	private double workHours;
	private EmployeeRole role;
	private double hourlySalary;
	
	public Employee(String id, String firstName, String lastName, String phoneNumber, String address, double workHours,
			EmployeeRole role, double hourlySalary) {
		super(id, firstName, lastName, phoneNumber, address);
		this.workHours = workHours;
		this.role = role;
		this.hourlySalary = hourlySalary;
	}

	public double getWorkHours() {
		return workHours;
	}

	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}

	public EmployeeRole getRole() {
		return role;
	}

	public void setRole(EmployeeRole role) {
		this.role = role;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	@Override
	public String toString() {
		return "Employee [taxPercent=" + taxPercent + ", workHours=" + workHours + ", role=" + role + ", hourlySalary="
				+ hourlySalary + "]";
	}
	
	public double calculateSalary() {
		return this.hourlySalary * this.workHours;
	}
	public double calculateSalaryWithTax() {
		double toMultiply = 0.825;
		return (this.hourlySalary * this.workHours) * toMultiply;
	}
	
	
	
	
}
	
