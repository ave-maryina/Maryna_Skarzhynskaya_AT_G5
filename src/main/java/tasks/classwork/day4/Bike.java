package tasks.classwork.day4;

public class Bike extends Vehicle implements Movable {

    public Bike(String color, int speed, String model, Wheel[] wheels) {

        super(color, speed, model, wheels);

    }

    @Override
    public void start() {
        System.out.println("Bike has started");

    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");

    }

}
