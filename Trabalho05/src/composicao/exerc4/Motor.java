package composicao.exerc4;

public class Motor {
	
	private Integer potencia;
	private Double capacidadeCombustivel;
	private String tipoCombustivel;
	
	public Motor(Integer potencia, Double capacidadeCombustivel, String tipoCombustivel) {
		this.potencia = potencia;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.tipoCombustivel = tipoCombustivel;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public Double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	@Override
	public String toString() {
		return String.format("\nPotência: %-4d | Tipo Combustível: %-8s | Capacidade: %-2.2f", potencia, tipoCombustivel, capacidadeCombustivel);
	}
}
