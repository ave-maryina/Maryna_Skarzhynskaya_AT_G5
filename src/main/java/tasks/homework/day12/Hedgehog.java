package tasks.homework.day12;

public class Hedgehog {

    final String PATTERN = "Hedgehog <n>";
    private String name;

    public Hedgehog(int number) {
        name = PATTERN.replace("<n>", String.valueOf(number));
    }

    public void tellMe() throws InterruptedException {
        System.out.println("I am " + name + "!");
        Thread.sleep(50);
    }
}
