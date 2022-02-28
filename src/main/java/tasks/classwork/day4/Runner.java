package tasks.classwork.day4;

public class Runner {

    public static void main(String[] args) {

        Wheel[] wheels = {
                    new Wheel(16, "summer"),
                    new Wheel(16, "summer"),
                    new Wheel(16, "summer"),
                    new Wheel(16, "summer")};

        Machinary car = new Car("red", 120, "honda", wheels);
        Movable car2 = new Car("blue", 100, "Reno", wheels);
        Bike bike = new Bike("red", 200, "Honda", wheels);
        Bike bike2 = new Bike("gray", 190, "Harley-Davidson", wheels);
        Boeing boeing = new Boeing("747");


        VehicleProcessor vehicleProcessor = new VehicleProcessor();
        vehicleProcessor.printInfoVehicle((Vehicle) car);
        vehicleProcessor.printInfoVehicle((Vehicle) car2);
        vehicleProcessor.printInfoVehicle(bike);
        vehicleProcessor.printInfoVehicle(bike2);

        vehicleProcessor.startMovable((Movable) car);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(boeing);

        vehicleProcessor.machinaryDetails(boeing);
        vehicleProcessor.machinaryDetails(car);


        vehicleProcessor.startMovable(new Movable() {
            @Override
            public void start() {
                System.out.println("Boat has started");
            }

            @Override
            public void stop() {
                System.out.println("Boat has stopped");

            }
        });


    }
}