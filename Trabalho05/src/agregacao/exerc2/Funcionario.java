package agregacao.exerc2;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private Double salario;
	
	public Funcionario(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("\nNome: %-25s | Cargo: %-20s | Salário: %-6.2f", nome, cargo, salario);
	}
}
