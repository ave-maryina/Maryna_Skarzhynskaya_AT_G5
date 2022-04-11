package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    private Transformable stuff;

    public Cup(double volume, double diameter, int weight, Material material) {
        super(300, 8.0, Material.Glass);
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
    public void open() {
    }

    @Override
    public void warm(int temperature) {
    }
}
