package tasks.classwork.day4;

public class VehicleProcessor {

    public  void  printInfoVehicle(Vehicle vehicle) {

        System.out.println("name is: " + vehicle.name);
        System.out.println("color is: " + vehicle.getColor());
        System.out.println("speed is: " + vehicle.getSpeed());
        System.out.println("model is: " + vehicle.getModel());
        System.out.println("wheels # " + vehicle.getWheels().length);

        for (Wheel wheel : vehicle.getWheels()) {
            System.out.println("----- wheel drill down:");
            System.out.println("wheel type is: " + wheel.getType() + "wheel diameter is: " + wheel.getDiameter());
        }
    }

    public void machinaryDetails(Machinary machinary) {

        System.out.println("name is: " + machinary.name);
        if(!(machinary instanceof Plane)) {
            System.out.println("model is: " + ((Vehicle)machinary).getModel());
        }
    }

    public  void printInfoBoeing(Boeing boeing) {
        System.out.println("name is: " + boeing.name);
    }

    public  void startMovable(Movable movable) {
        movable.start();

    }

    public  void stopMovable(Movable movable) {
        movable.stop();

    }

}
