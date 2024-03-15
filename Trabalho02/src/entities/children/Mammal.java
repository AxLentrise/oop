package entities.children;

import entities.Animal2;

public class Mammal extends Animal2 {
	
	private String genus;
	
	public Mammal() {}
	
	public Mammal(String name, Integer age, String genus) {
		super(name, age);
		this.genus = genus;
	}

	public final String getGenus() {
		return genus;
	}

	public final void setGenus(String genus) {
		this.genus = genus;
	}
	
	public void makeSound() {
		System.out.println("Moo!\n");
		// lmao
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Mammal Name: %s\n", super.name));
		sb.append(String.format("Mammal Age: %s\n", super.age));
		sb.append(String.format("Mammal Genus: %s\n", this.genus));
		return sb.toString();
	}
}
