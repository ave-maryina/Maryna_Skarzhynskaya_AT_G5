package project.warerhouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    private Warehouse warehouse;

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz) throws InterruptedException {
        createVessel(volume, material, stuff, clazz);
    }

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz) throws InterruptedException {
        return new Containable() {
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
        };
    }
}
