package project.stuff;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater(double volume) {
        System.out.println("Set bubbles. Call method isOpened()");
        bubbles = IntStream.rangeClosed(0, (int) (volume * 10000)).boxed().map(i -> new Bubble()).collect(Collectors.toList());
        isOpened();
    }

    private void isOpened() {
        Thread thread = new Thread(() -> {
            try {
                if (!isOpened) {
                    System.out.println("Bottle is closed");
                    Thread.sleep(2000);
                } else {
                    degas();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }

    private void degas() throws InterruptedException {
        System.out.println("Releases batch of bubbles every second");
        for (int i = 0; i < bubbles.size(); i += 10 + 5 * this.getTemperature()) {
            for (int j = i; j <= i + 10 + 5 * this.getTemperature(); j++) {
                bubbles.get(j).cramp();
                bubbles.remove(j);
            }
            Thread.sleep(1000);
        }
    }

    public void setOpened() {
        System.out.println("Change state of the water to open");
        isOpened = true;
    }

    public boolean isSparkle() {
        return bubbles.get(bubbles.size() - 1) == null;
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

}


