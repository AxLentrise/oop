package entities.shape;

public class Circle extends Shape {

	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double calcArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public Double calcPerimeter() {
		return 2*Math.PI*radius;
	}
}
