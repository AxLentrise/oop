package subclasses.vehicles;

import superclasses.Vehicle;

public class Motorcycle extends Vehicle {

    private String model;

    public Motorcycle() {}

    public Motorcycle(String color, String model) {
        super(color);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void speedUp(Integer gear) {
        // Motorcycle does not have R gear
        if((gear < 0) || (gear>5)) {
            System.out.println("Gear out of clutch.\n");
        } else {
            this.speed = gear*60.5;
        }
    }

}
