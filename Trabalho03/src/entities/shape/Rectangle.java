package entities.shape;

public class Rectangle extends Shape {
	
	private Double width;
	private Double heigth;
	
	public Rectangle(Double width, Double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public Double calcArea() {
		return width*heigth;
	}
	
	@Override
	public Double calcPerimeter() {
		return (width+heigth)*2;
	}
}
