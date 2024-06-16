package entities.employee;

public class Developer extends Employee {

	private static Double BONUS_CONST = 0.25;
	
	public Developer(String name, Double salary) {
		super(name, salary);
	}
	
	@Override
	public Double calcBonus() {
		return super.getSalary()+super.getSalary()*BONUS_CONST;
	}
	
	
}
