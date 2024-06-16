package entities;

public class EmpregadoHoras extends Empregado {

	private Double valorPorHora;
	
	public EmpregadoHoras(String nome, String departamento, Integer id, Double valorPorHora) {
		super(nome, departamento, id);
		this.valorPorHora = valorPorHora;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	@Override
	public Double calcSalario() {
		System.out.println("Valor por Hora");
		return valorPorHora;
	}

	@Override
	public Double calcSalario(Double v) {
		return v*48;
	}
}
