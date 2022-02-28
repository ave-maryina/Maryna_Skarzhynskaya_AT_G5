package project.run;

import project.boxing.Bottle;

public class Runner extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Bottle bottle0_5 = new Bottle(0.5);
        Bottle bottle1 = new Bottle(1);
        Bottle bottle1_5 = new Bottle(1.5);

        bottle0_5.open();
        bottle1.open();
        bottle1_5.open();

        //Bottle bottle1_5 = new Bottle(1.5, sparklingWater, 5);
        //Bottle bottle1_50 = new Bottle(1.5, sparklingWater, 22);
        //Runner thread = new Runner();
        //thread.start();

    }

    @Override
    public void run() {



    }
}
