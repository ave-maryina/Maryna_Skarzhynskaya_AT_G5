package project.boxing;

import project.interfaces.Containable;
import project.Material.Glass;
import project.Material.Material;
import project.interfaces.Transformable;

public class Cup extends Vessel implements Containable {


    public Cup(double volume, double diameter, int weight, Material material) {
        super(300, 15, 370, new Glass());
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
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }
}
