package entities;

public class Employee {
	
	protected String name;
	protected Double salary;
	
	protected static final StringBuilder sb = new StringBuilder();
	
	public Employee() {}
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public final String getName() {
		return this.name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Double getSalary() {
		return this.salary;
	}

	public final void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Employee Name: %s\n", this.name));
		sb.append(String.format("Employee Salary: %.2f\n", this.salary));
		return sb.toString();
	}
}
