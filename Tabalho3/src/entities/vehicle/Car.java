package entities.vehicle;

public class Car extends Vehicle {
	
	private static Double SPEED_PER_GEAR = 40.5;
	
	public Car(String brand, String model) {
		super(brand, model);
	}

	@Override
	public Double speedUp() {
		int gear = super.getGear();
		if(gear == 0) return 0.0;
		
		// Essa loucura é minha tentativa de aproximar o resultado para uma
		// velocidade média real de um carro popular de 2024, considerando
		// as relações de marcha e decaimento de torque final em relaçao a CV do motor, mas desconsiderando RPM
		return gear*SPEED_PER_GEAR-(SPEED_PER_GEAR/(5*gear));
	}
	
	@Override
	public void gearUp() {
		if(super.getGear() <= 4) {
			super.gearUp();
		} else {
			System.out.println("O carro já está em marcha máxima.");
		}
	}
	
	@Override
	public void gearDown() {
		if(super.getGear() >= 0) {
			super.gearDown();
		} else {
			System.out.println("O carro já está em marcha ré");
		}
	}
}
