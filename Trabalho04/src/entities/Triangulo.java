package entities;

public class Triangulo extends FiguraGeometrica {
	
	private Double base;
	private Double height;
	
	public Triangulo(Double base, Double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double calcArea() {
		return (base*height)/2;
	}

	@Override
	public Double calcPerimeter() {
		return null;
	}
}
