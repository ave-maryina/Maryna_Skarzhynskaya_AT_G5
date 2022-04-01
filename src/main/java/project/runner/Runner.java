package project.runner;

import project.stuff.SparklingWater;
import project.vessel.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Bottle bottle1 = new Bottle(1.5);
        bottle1.addStuff(new SparklingWater(1.5).setTemperature(5));
        bottle1.open();
    }
}
