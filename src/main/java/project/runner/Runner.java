package project.runner;

import project.stuff.SparklingWater;
import project.stuff.Water;
import project.vessel.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Bottle bottle1 = new Bottle(1.5);
        Water water = new SparklingWater(1.5);
        water.setTemperature(5);
        bottle1.addStuff(water);
        bottle1.open();
    }
}
