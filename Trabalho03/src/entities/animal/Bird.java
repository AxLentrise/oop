package entities.animal;

public class Bird extends Animal {
	
	public Bird() {
		makeSound();
		move();
	}
	
	@Override
	public void makeSound() {
		System.out.println("Piu!");
	}
	
	@Override
	public void move() {
		System.out.println("Moved!");
	}
}
