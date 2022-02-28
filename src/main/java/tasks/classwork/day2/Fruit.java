package tasks.classwork.day2;

public class Fruit {
    private int sugar;
    private String name;

    public Fruit(int sugar, String name) {
        this.sugar = sugar;
        this.name = name;
    }

    public int getSugar() {
        return sugar;
    }

    public String getName() {
        return name;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setName(String name) {
        this.name = name;
    }
}
