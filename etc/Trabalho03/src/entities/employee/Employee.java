package entities.employee;

import interfaces.EmployeeInterface;

public class Employee implements EmployeeInterface {
	
	private static Double BONUS_CONST = 0.1;
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public Double calcBonus() {
		return salary+salary*BONUS_CONST;
	}
	
}
