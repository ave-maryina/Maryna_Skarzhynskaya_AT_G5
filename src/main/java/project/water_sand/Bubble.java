package project.water_sand;

import java.util.Objects;

public class Bubble {

    private static final double VOLUME = 0.3;
    private String gas;


    public Bubble(String gas) {
        System.out.println("Initialize gas field");
        this.gas = gas;
    }



    public void cramp() {
        //System.out.println("Print \"Cram\"");
        System.out.print("Cramp! ");
    }


    public double getVolume() {
        System.out.println("Return volume of bubble");
        return VOLUME;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }
}
