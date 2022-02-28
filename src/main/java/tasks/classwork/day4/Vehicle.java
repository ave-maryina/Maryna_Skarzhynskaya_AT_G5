package tasks.classwork.day4;

public abstract class Vehicle extends Machinary {

    protected String color;
    protected int speed;
    protected String model;
    protected Wheel[] wheels;

    public Vehicle(String color, int speed, String model, Wheel[] wheels) {
        super("Vehicle");
        this.color = color;
        this.speed = speed;
        this.model = model;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
}
