package project.vessel;

import project.stuff.Transformable;

public interface Containable {

    void addStuff(Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
    void open();
    void warm(int temperature);
}
