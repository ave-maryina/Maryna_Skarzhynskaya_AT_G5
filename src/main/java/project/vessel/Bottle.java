package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Bottle extends Vessel implements Containable {

    private Transformable stuff;

    public Bottle(double volume) throws InterruptedException {
        super(volume, 2.0, Material.Plastic);
        System.out.println("Bottle setter");
    }

    @Override
    public void addStuff(Transformable stuff) {

        this.stuff = stuff;
    }

    @Override
    public Transformable removeStuff() {
        return stuff = null;
    }

    @Override
    public boolean isEmpty() {
        return stuff == null;
    }

    public void open() {
        System.out.println("Open the bottle");
        stuff.setOpened();
    }

    public void warm(int temperature) {
        System.out.println("Set temperature of the staff in the bottle");
        stuff.setTemperature(temperature);
    }

    public Transformable getStuff() {
        return stuff;
    }

    public void setStuff(Transformable stuff) {
        this.stuff = stuff;
    }
}
