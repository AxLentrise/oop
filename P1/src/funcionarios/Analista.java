package funcionarios;

public class Analista extends Funcionario {

	private static StringBuilder sb = new StringBuilder();
	public static Double PROJETO = 175.00;
		
	public Analista(String name, String role, Double baseSalary) {
		super(name, role, baseSalary);
	}	
	
	@Override
	public Double calcularSalarioLiquido() {
		return super.calcularSalarioLiquido()+PROJETO;
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
