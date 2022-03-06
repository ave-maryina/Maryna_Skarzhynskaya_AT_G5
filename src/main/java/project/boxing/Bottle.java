package project.boxing;

import project.water.Bubble;
import project.water.SparklingWater;

public class Bottle {

    private double volume;
    private SparklingWater water = new SparklingWater();

    public Bottle(double volume, int temperature) throws InterruptedException {
        System.out.println("Bottle is filled with an array of bubbles according to the volume");
        this.volume = volume;
        this.water.setTemperature(temperature);
        Bubble[] bubbles = new Bubble[(int) (volume * 10000)];
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("carbon dioxide");
        }
        this.water.pump(bubbles);

    }
   /* public void isOpened() throws InterruptedException {
        while (!isOpened) {
            Thread.sleep(2);
            if (isOpened) {
                this.sparklingWater.degas(sparklingWater.getBubbles());
            }
        }
    }*/

    public void open() {
        System.out.println("Change the state of the water to open");
        this.water.setOpened(true);

    }
    public void warm(int temperature) {
        System.out.println("Set temperature of the water in the bottle");
        this.water.setTemperature(temperature);
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
        this.water = water;
    }

}
