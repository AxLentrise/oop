package funcionarios;

public class Vendedor extends Funcionario {

	private static StringBuilder sb = new StringBuilder();
	private static Double BONUS = 27.50;
	private Integer totalVendas;

	public Vendedor(String name, String role, Double baseSalary, Integer totalVendas) {
		super(name, role, baseSalary);
		this.totalVendas = totalVendas;
	}

	public Integer getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	@Override
	public Double calcularSalarioLiquido() {
		return super.calcularSalarioLiquido()+BONUS*totalVendas;
	}
	
	@Override
	public String imprimirContraCheque() {
		sb.setLength(0);
		sb.append(String.format("Nome: %s\n", super.getName()));
		sb.append(String.format("Cargo: %s\n", super.getRole()));
		sb.append(String.format("Salário base: %.2f\n", super.getBaseSalary()));
		sb.append(String.format("Total de vendas: %d\n", this.totalVendas));
		sb.append(String.format("Salário líquido: %.2f\n", this.calcularSalarioLiquido()));
		return sb.toString();
	}
	
	
	
}
