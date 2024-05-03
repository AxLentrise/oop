package entities.figuras;

public class Triangulo extends FiguraGeometrica {
	
	private Double sideA;
	private Double sideB;
	private Double sideC;

	public Triangulo(Double sideA, Double sideB, Double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Double getSideA() {
		return sideA;
	}

	public Double getSideB() {
		return sideB;
	}

	public Double getSideC() {
		return sideC;
	}

	@Override
	public Double calcArea() {
		double s = (sideA + sideB + sideC)/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	@Override
	public Double calcPerimeter() {
		return sideA + sideB + sideC;
	}
}
