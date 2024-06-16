package application;

import entities.animal.Animal;
import entities.animal.Bird;
import entities.animal.Cat;
import entities.animal.Dog;
import entities.employee.Developer;
import entities.employee.Employee;
import entities.employee.Manager;
import entities.product.Electronic;
import entities.product.Food;
import entities.product.Product;
import entities.shape.Circle;
import entities.shape.Rectangle;
import entities.shape.Shape;
import entities.shape.Triangle;
import entities.vehicle.Car;
import entities.vehicle.Motorcycle;
import entities.vehicle.Truck;
import entities.vehicle.Vehicle;

public class Application {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Honda", "Civic");
		System.out.printf("Velocidade média do %s %s:\n", car.getBrand(), car.getModel());
		for(int i = 0; i <= 5; i++) {
			System.out.printf("Gear: %d — ", car.getGear());    		// Obtem a marcha atual
			System.out.printf("Speed: %.1f\n", car.speedUp());			// Mostra a velocidade média para a marcha		
			car.gearUp();												// Aumenta a marcha em 1 se for possível
		}
		
		Vehicle motorcycle = new Motorcycle("Kawasaki", "H2R");
		System.out.printf("\nVelocidade média da %s %s:\n", motorcycle.getBrand(), motorcycle.getModel());
		for(int i = 0; i <= 6; i++) {
			System.out.printf("Gear: %d — ", motorcycle.getGear());     // Obtem a marcha atual
			System.out.printf("Speed: %.1f\n", motorcycle.speedUp());	// Mostra a velocidade média para a marcha		
			motorcycle.gearUp();										// Aumenta a marcha em 1 se for possível
		}
		
		Vehicle truck = new Truck("Volvo", "FH16");
		System.out.printf("\nVelocidade média do %s %s:\n", truck.getBrand(), truck.getModel());
		for(int i = 0; i <= 12; i++) {
			System.out.printf("Gear: %d — ", truck.getGear());    		// Obtem a marcha atual
			System.out.printf("Speed: %.1f\n", truck.speedUp());  		// Mostra a velocidade média para a marcha		
			truck.gearUp();										  		// Aumenta a marcha em 1 se for possível
		}
		
		// Demais métodos foram testados, mas não fazem sentido para a proposta do exercício
		
		Shape circle = new Circle(5.5);
		System.out.printf("\nArea of circle: %.5f\n", circle.calcArea());
		System.out.printf("Perimeter of circle: %.5f\n", circle.calcPerimeter());
		
		Shape rectangle = new Rectangle(5.5, 9.0);
		System.out.printf("\nArea of rectangle: %.5f\n", rectangle.calcArea());
		System.out.printf("Perimeter of rectangle: %.5f\n", rectangle.calcPerimeter());
		
		// Um dos lados é a própria base, por isso estou inicializando apenas dois lados
		Double [] sides = {3.3, 4.5}; 
		Shape triangle = new Triangle(5.5, 10.0, sides);
		System.out.printf("\nArea of triangle: %.5f\n", triangle.calcArea());
		System.out.printf("Perimeter of triangle: %.5f\n", triangle.calcPerimeter());
		
		Employee employee = new Employee("Gengis", 1440.00);
		System.out.printf("\nName: %s - Salary: %.2f - Ocuppation: Employee\n", employee.getName(), employee.getSalary());
		System.out.printf("Paycheck with bonus: %.2f\n", employee.calcBonus());
		
		Employee manager = new Manager("Khan", 3750.00);
		System.out.printf("\nName: %s - Salary: %.2f - Ocuppation: Manager\n", manager.getName(), manager.getSalary());
		System.out.printf("Paycheck with bonus: %.2f\n", manager.calcBonus());
		
		Employee developer = new Developer("Xi Jiping", 9275.00);
		System.out.printf("\nName: %s - Salary: %.2f - Ocuppation: Developer\n", developer.getName(), developer.getSalary());
		System.out.printf("Paycheck with bonus: %.2f\n", developer.calcBonus());
		
		System.out.println("Dog:");
		Animal dog = new Dog();
		System.out.println();
		System.out.println("Cat:");
		Animal cat = new Cat();
		System.out.println();
		System.out.println("Bird:");
		Animal bird = new Bird();
		
		System.out.println();
		System.out.println();
		Product laptop = new Electronic("Dell XPS", 1000.00);
		System.out.printf("Product name: %s | Price: %.2f\n", laptop.getName(), laptop.getPrice());
		System.out.printf("Discount of 15%% in the value of %.2f\n", laptop.calcDiscount(0.15));
		System.out.printf("Price with the discount: %.2f", laptop.getPrice()-laptop.calcDiscount(15.0));
		
		Product pizza = new Food("Pizza", 20.00);
		System.out.printf("Product name: %s | Price: %.2f\n", pizza.getName(), pizza.getPrice());
		System.out.printf("Discount of 30%% in the value of %.2f\n", pizza.calcDiscount(0.30));
		System.out.printf("Price with the discount: %.2f", pizza.getPrice()-pizza.calcDiscount(30.0));
				
	}
}
