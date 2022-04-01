package tasks.homework.day12;


public class Mouse {

    final String PATTERN = "Mouse <n>";
    private String name;
    int numberOfMouse;

    public Mouse(int number) {
        name = PATTERN.replace("<n>", String.valueOf(number));
        numberOfMouse = number;
    }

    public void peep() throws InterruptedException {
        System.out.println(name + " PEEP!");
        Thread.sleep(200);
    }
}
