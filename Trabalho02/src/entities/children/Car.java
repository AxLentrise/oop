package entities.children;

import entities.Vehicle;

public class Car extends Vehicle {
	
	private String color;
	
	public Car () {}
	
	public Car(String model, Integer year, String color) {
		super(model, year);
		this.color = color;
	}
	
	public final String getColor() {
		return this.color;
	}
	
	public final void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Car Model: %s\n", super.model));
		sb.append(String.format("Car Year: %s\n", super.year));
		sb.append(String.format("Car Color: %s", this.color));
		return sb.toString();
	}
	
}
