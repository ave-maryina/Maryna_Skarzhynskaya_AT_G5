package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    private Transformable stuff;


    public Can() {
        super(250, 10.0, Material.Metal);
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
