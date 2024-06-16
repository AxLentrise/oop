package entities.figuras;

public class Circulo extends FiguraGeometrica {

	private Double raio;

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double calcArea() {
		return Math.PI*Math.pow(raio, 2);
	}

	@Override
	public Double calcPerimeter() {
		return Math.PI*raio;
	}
}
