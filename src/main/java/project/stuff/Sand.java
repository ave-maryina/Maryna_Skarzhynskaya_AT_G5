package project.stuff;

import java.util.Objects;

public class Sand implements Transformable {

    private int weight;
    private String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sand{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sand sand = (Sand) o;
        return weight == sand.weight && Objects.equals(name, sand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setOpened() {

    }

    @Override
    public Transformable setTemperature(int temperature) {

        return null;
    }
}
