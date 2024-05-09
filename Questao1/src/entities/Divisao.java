package entities;

public class Divisao extends OperacaoMatematica {
	
	public Divisao() {}

	public Double calcula(Double x, Double y) {
		if(y == 0) {
			System.out.println("Não é possível fazer divisão por zero.");
			return 0.0;
		}
		
		return x / y;
	}
}
