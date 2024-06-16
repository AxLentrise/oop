package funcionarios;

public class Gerente extends Funcionario {

	private static StringBuilder sb = new StringBuilder();
	public static Double BONUS = 250.00;
		
	public Gerente(String name, String role, Double baseSalary) {
		super(name, role, baseSalary);
	}
	
	@Override
	public Double calcularSalarioLiquido() {
		return super.calcularSalarioLiquido()+BONUS;
	}
	
	@Override
	public String imprimirContraCheque() {
		sb.setLength(0);
		sb.append(String.format("Nome: %s\n", super.getName()));
		sb.append(String.format("Cargo: %s\n", super.getRole()));
		sb.append(String.format("Salário base: %.2f\n", super.getBaseSalary()));
		sb.append(String.format("Salário líquido: %.2f\n", this.calcularSalarioLiquido()));
		return sb.toString();
	}
}
