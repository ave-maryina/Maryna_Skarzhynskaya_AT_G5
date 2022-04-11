package project.warerhouse;

import project.vessel.Containable;

import java.util.List;
import java.util.Objects;

public class VesselBox {

    private String name = "I am box with <25> <Bottles>";
    private int capacity;
    private List<Containable> box;
    private long id = 0;

    public VesselBox(String name,  List<Containable> box) {
        this.name = name;
        this.box = box;
        id ++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VesselBox vesselBox = (VesselBox) o;
        return capacity == vesselBox.capacity && id == vesselBox.id && Objects.equals(name, vesselBox.name) && Objects.equals(box, vesselBox.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, box, id);
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }
}
