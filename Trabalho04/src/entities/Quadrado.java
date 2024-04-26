package entities;

public class Quadrado extends FiguraGeometrica {

	private Double sides;
	
	public Quadrado(Double sides) {
		super();
		this.sides = sides;
	}

	public Double getSides() {
		return sides;
	}
	
	public void setSides(Double sides) {
		this.sides = sides;
	}
	
	@Override
	public Double calcArea() {
		return Math.pow(sides, 2);
	}

	@Override
	public Double calcPerimeter() {
		return 2*sides;
	}
}
