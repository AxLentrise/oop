package entities;

public class Vehicle {
	
	protected String model;
	protected Integer year;
	
	protected static final StringBuilder sb = new StringBuilder();
	
	public Vehicle () {}
	
	public Vehicle (String model, Integer year) {
		this.model = model;
		this.year = year;
	}

	public final String getModel() {
		return this.model;
	}

	public final void setModel(String model) {
		this.model = model;
	}

	public final Integer getYear() {
		return this.year;
	}

	public final void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Vehicle Model: %s\n", this.model));
		sb.append(String.format("Vehicle Year: %s\n", this.year));
		return sb.toString();
	}
	
}
