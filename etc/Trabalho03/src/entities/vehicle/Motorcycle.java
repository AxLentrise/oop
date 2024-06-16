package entities.vehicle;

public class Motorcycle extends Vehicle {

	private static Double SPEED_PER_GEAR = 110.5;
	private static Double CONTROL_CONST = 2.525;
	
	public Motorcycle(String brand, String model) {
		super(brand, model);
	}

	@Override
	public Double speedUp() {
		int gear = super.getGear();
		if(gear == 0) return 0.0;
		
		// velocidade média real de uma moto bem peculiar considerando
		// as relações de marcha e decaimento de torque final em relaçao a CV do motor, mas desconsiderando RPM
		return gear*SPEED_PER_GEAR-(gear*SPEED_PER_GEAR/CONTROL_CONST);
	}
	
	@Override
	public void gearUp() {
		if(super.getGear() <= 5) {
			super.gearUp();
		} else {
			System.out.println("A moto já está em marcha máxima.");
		}
	}
	
	@Override
	public void setReverse() {
		System.out.println("Motos não tem marcha ré.");
	}
	
	@Override
	public void gearDown() {
		System.out.println("Motos não tem marcha ré.");
	}
}
