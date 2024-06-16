package entities.animal;

public class Cat extends Animal {
	
	public Cat() {
		makeSound();
		move();
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	@Override
	public void move() {
		System.out.println("Moved!");
	}
}
