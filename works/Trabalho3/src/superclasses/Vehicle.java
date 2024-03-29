package superclasses;

public class Vehicle {

    protected String color;
    protected Double speed;
    protected Integer gear;

    public Vehicle() {}

    public Vehicle(String color) {
        this.color = color;
        this.gear = 0; // gear zero would be equivalent to N here, -1 R
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }

    public String getColor() {
        return color;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speedUp(Integer gear) {
        // TODO - add speed speed modifier based on vehicle type
    }
}
