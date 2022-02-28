package tasks.classwork.day2;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple1 = new Apple(12, "apple");
        Apple apple = new Apple(112, "красный", "кисло-сладкий", 200);
        apple1.setColor("зеленый");
        apple1.setTaste("сладкий");
        apple1.setWeight(190);
        System.out.println("Apple color " + apple.getColor());
        System.out.println(apple1);

    }
}
