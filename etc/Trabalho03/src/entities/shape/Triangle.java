package entities.shape;

public class Triangle extends Shape {
	
	private Double base;
	private Double heigth;
	private Double sides[];
	
	public Triangle(Double base, Double heigth, Double sides[]) {
		this.base = base;
		this.heigth = heigth;
		this.sides = sides;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	public Double[] getSides() {
		return sides;
	}

	public void setSides(Double[] sides) {
		this.sides = sides;
	}
	
	@Override
	public Double calcArea() {
		return base*heigth/2;
	}
	
	@Override
	public Double calcPerimeter() {
		double sum = 0;
		for(Double side : sides) {
			sum += side;
		}
		return sum+base;
	}
}
