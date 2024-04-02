package entities.animal;

public class Dog extends Animal {
	
	public Dog() {
		makeSound();
		move();
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bark!");
	}
	
	@Override
	public void move() {
		System.out.println("Moved!");
	}
}
