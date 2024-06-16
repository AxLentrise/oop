package entities;

public class EmpregadoSalario extends Empregado {

	private Double salarioMensal;

	public EmpregadoSalario(String nome, String departamento, Integer id, Double salarioMensal) {
		super(nome, departamento, id);
		this.salarioMensal = salarioMensal;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public Double calcSalario() {
		return salarioMensal;
	}

	@Override
	public Double calcSalario(Double v) {
		return salarioMensal;
	}
}
