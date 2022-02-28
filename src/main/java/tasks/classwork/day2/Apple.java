package tasks.classwork.day2;

public class Apple extends Fruit {

    private String color;
    private String taste;
    private int weight;

    public Apple(int sugar, String color, String taste, int weight) {
        super(sugar, "apple");
        this.color = color;
        this.taste = taste;
        this.weight = weight;
    }

    public Apple(int sugar, String name) {
        super(sugar, name);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' + "sugar=" + getSugar() +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
