package funcionarios;

public class Funcionario {
	
	private static StringBuilder sb = new StringBuilder();
	
	private String name;
	private String role;
	private Double baseSalary;
	
	public Funcionario() {}
	
	public Funcionario(String name, String role, Double baseSalary) {
		this.name = name;
		this.role = role;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Double calcularSalarioLiquido() {
		return baseSalary*0.90; // Redução de 10% no valor do salario em folha, pelos descontos
	}
	
	public String imprimirContraCheque() {
		sb.setLength(0);
		sb.append(String.format("Nome: %s\n", this.name));
		sb.append(String.format("Cargo: Não definido\n"));
		sb.append(String.format("Salario Base: %.2f\n", this.baseSalary));
		sb.append(String.format("Salario liquido: %.2f\n", this.calcularSalarioLiquido()));
		return sb.toString();
	}
}
