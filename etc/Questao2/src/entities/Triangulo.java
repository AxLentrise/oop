package entities;

public class Triangulo extends Forma {
	
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;

	public Triangulo(String nome, String cor, Double sideA, Double sideB, Double sideC) {
		super(nome, cor);
		this.ladoA = sideA;
		this.ladoB = sideB;
		this.ladoC = sideC;
	}

	public Double getSideA() {
		return ladoA;
	}

	public Double getSideB() {
		return ladoB;
	}

	public Double getSideC() {
		return ladoC;
	}

	@Override
	public Double calcArea() {
		double s = (ladoA + ladoB + ladoC)/2;
		return Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));
	}

	@Override
	public Double calcPerimeter() {
		return ladoA + ladoB + ladoC;
	}
}
