package entities.employee;

public class Manager extends Employee {

	private static Double BONUS_CONST = 0.15;
	
	public Manager(String name, Double salary) {
		super(name, salary);
	}
	
	@Override
	public Double calcBonus() {
		return super.getSalary()+super.getSalary()*BONUS_CONST;
	}
	
	
}
