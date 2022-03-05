package project.run;

import project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

//        Bottle bottle0_5 = new Bottle(0.5);
//        Bottle bottle1 = new Bottle(1);
//        Bottle bottle1_5 = new Bottle(1.5);

        Bottle bottle1 = new Bottle(1.5, 5);
        Bottle bottle2 = new Bottle(1.5, 22);
        bottle1.open();
        bottle2.open();
    }
}
