package project.boxing;

import project.interfaces.Containable;
import project.Material.Metal;
import project.interfaces.Transformable;

public class Can extends Vessel implements Containable {

    public Can() {
        super(250, 35, 450, new Metal());
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
