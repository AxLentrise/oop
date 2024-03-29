package application;

import entities.vehicle.Car;
import entities.vehicle.Motorcycle;
import entities.vehicle.Truck;
import entities.vehicle.Vehicle;

public class Application {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Honda", "Civic");
		System.out.printf("Velocidade média do %s %s:\n", car.getBrand(), car.getModel());
		for(int i = 0; i <= 5; i++) {
			System.out.printf("Gear: %d — ", car.getGear());    // Obtem a marcha atual
			System.out.printf("Speed: %.1f\n", car.speedUp());	// Mostra a velocidade média para a marcha		
			car.gearUp();										// Aumenta a marcha em 1 se for possível
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
			System.out.printf("Gear: %d — ", truck.getGear());    // Obtem a marcha atual
			System.out.printf("Speed: %.1f\n", truck.speedUp());  // Mostra a velocidade média para a marcha		
			truck.gearUp();										  // Aumenta a marcha em 1 se for possível
		}
		
		// Demais métodos foram testados, mas não fazem sentido para a proposta do exercício
		
		
	}
}
