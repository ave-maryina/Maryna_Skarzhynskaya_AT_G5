package project.boxing;

import project.interfaces.Containable;
import project.Material.Plastic;
import project.interfaces.Transformable;
import project.water_sand.Bubble;
import project.water_sand.SparklingWater;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private double volume;
    private SparklingWater water = new SparklingWater();


    public Bottle(double volume, int temperature) throws InterruptedException {

        super(volume, 4.5, 750, new Plastic());
        System.out.println("Bottle is filled with an array of bubbles according to the volume");
        this.volume = volume;
        this.water.setTemperature(temperature);
        //Bubble[] bubble = new Bubble[(int) (volume * 10000)];
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < volume * 10000; i++) {
            bubbles.add(new Bubble("CO2"));
        }
        this.water.pump(bubbles);
    }

    @Override
    public void addStuff(Transformable stuff) {
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {
        System.out.println("Change the state of the water to open");
        water.setOpened(true);
    }

    @Override
    public void close() {
    }

    public void warm(int temperature) {
        System.out.println("Set temperature of the water in the bottle");
        water.setTemperature(temperature);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SparklingWater getWater() {
        System.out.println("Return object water");
        return water;
    }

    public void setWater(SparklingWater sparklingWater) {
        System.out.println("Add new object of water");
        this.water = sparklingWater;
    }

}
