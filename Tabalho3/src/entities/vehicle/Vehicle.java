package entities.vehicle;

import services.AccelerateService;

public class Vehicle implements AccelerateService {
	
	private String brand;
	private String model;
	private Integer gear;
	
	public Vehicle(String brand, String model) {
		this.brand = brand;
		this.model = model;
		setNeutral();
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Integer getGear() {
		return this.gear;
	}

	public void gearUp() {
		this.gear++;
	}
	
	public void gearDown() {
		this.gear--;
	}
	
	public Double speedUp() {
		return null;
	}
	
	public void setNeutral() {
		this.gear = 0;
	}
	
	public void setReverse() {
		this.gear = -1;
	}	
}
