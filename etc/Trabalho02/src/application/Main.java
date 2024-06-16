package application;

import entities.Animal;
import entities.Animal2;
import entities.Employee;
import entities.Person;
import entities.Vehicle;
import entities.children.Car;
import entities.children.Dog;
import entities.children.Mammal;
import entities.children.Manager;
import entities.children.Student;

public class Main {

	public static void main(String[] args) {
		
		// Os Upcasting foram intencionais
		Animal animal = new Dog("Max", 19.5, "Golden");
		Person person = new Student("John", 22, "Computer Science");
		Vehicle vehicle = new Car("Civic", 2024, "Black");
		Employee employee = new Manager("Victoria", 8500.00, "P&D");
		// Com excessão da Class Mammal, para usar o método específico dela
		Mammal mammal = new Mammal("Bull", 6, "Bos Tarus");
		
		System.out.println(animal.toString());
		System.out.println();
		System.out.println(person.toString());
		System.out.println();
		System.out.println(vehicle.toString());
		System.out.println();
		System.out.println(employee.toString());
		System.out.println();
		System.out.println(mammal.toString());
		mammal.makeSound();
		
		
	}
	
}
