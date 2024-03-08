package entities.children;

import entities.Animal;

public class Dog extends Animal {
	
	private String race;
	
	public Dog () {}
	
	public Dog(String name, Double weigth, String race) {
		super(name, weigth);
		this.race = race;
	}
	
	public final String getRace() {
		return this.race;
	}
	
	public final void setRace(String race) {
		this.race = race;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Dog name: %s\n", super.name));
		sb.append(String.format("Dog weigth: %.1f\n", super.weight));
		sb.append(String.format("Dog race: %s", this.race));
		return sb.toString();
	}
	
}
