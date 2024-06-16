package entities;

public class Animal {
	
	protected String name;
	protected Double weight;
	
	protected static final StringBuilder sb = new StringBuilder();
	
	public Animal() {}
	
	public Animal(String name, Double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
	
	public final Double getWeight() {
		return this.weight;
	}
	
	public final void setWeight(Double weigth) {
		this.weight = weigth;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Animal name: %s\n", this.name));
		sb.append(String.format("Animal weigth: %.1f", this.weight));
		return sb.toString();
	}
}
