package project.boxing;

import project.water.Bubble;
import project.water.SparklingWater;

public class Bottle {

    private double volume;
    private SparklingWater sparklingWater = new SparklingWater();
    private boolean isOpened;

    public Bottle(double volume) throws InterruptedException {
        this.volume = volume;
        //this.sparklingWater.setTemperature(temperature);
        this.sparklingWater.setBubbles(new Bubble[(int) (this.volume * 10000)]);
        this.sparklingWater.pump();
        //this.isOpened();

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
        isOpened = true;
        sparklingWater.degas();

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SparklingWater getSparklingWater() {
        return sparklingWater;
    }

    public void setSparklingWater(SparklingWater sparklingWater) {
        this.sparklingWater = sparklingWater;
    }

}
