package subclasses.vehicles;

import superclasses.Vehicle;

public class Car extends Vehicle {

    private String model;

    public Car() {}

    public Car(String color, String model) {
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
        if((gear<-1) || (gear>5)) {
            System.out.println("Gear out of clutch.\n");
        } else {
            this.speed = gear*42.5;
        }
    }
}
