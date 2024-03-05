package entities;

public class Circle {
	
	private Double radius;
	
	public Circle() {}
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return this.radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public Double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
}
