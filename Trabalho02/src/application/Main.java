package application;

import entities.Animal;
import entities.Person;
import entities.children.Dog;
import entities.children.Student;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Dog("Max", 19.5, "Golden");
		Person person = new Student("John", 22, "Computer Science");
		
		System.out.println(animal.toString());
		System.out.println(person.toString());
		
	}
	
}
