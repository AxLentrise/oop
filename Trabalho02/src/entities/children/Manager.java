package entities.children;

import entities.Employee;

public class Manager extends Employee {
	
	private String sector;
	
	public Manager() {}
	
	public Manager(String name, Double salary, String sector) {
		super(name, salary);
		this.sector = sector;
	}

	public final String getSector() {
		return sector;
	}

	public final void setSector(String sector) {
		this.sector = sector;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Manager Name: %s\n", super.name));
		sb.append(String.format("Manager Salary: %.2f\n", super.salary));
		sb.append(String.format("Manager Sector: %s", this.sector));
		return sb.toString();
	}
	
}
