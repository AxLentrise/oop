package entities;

public class Quadrado extends Forma {

	private Double lados;
	
	public Quadrado(String nome, String cor, Double sides) {
		super(nome, cor);
		this.lados = sides;
	}

	public Double getSides() {
		return lados;
	}
	
	public void setSides(Double sides) {
		this.lados = sides;
	}
	
	@Override
	public Double calcArea() {
		return Math.pow(lados, 2);
	}

	@Override
	public Double calcPerimeter() {
		return 2*lados;
	}
}
