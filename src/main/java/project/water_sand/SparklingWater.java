package project.water_sand;

import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater() {
        super();
        System.out.println("Call method isOpened()");
        isOpened();
    }

    public void pump(List<Bubble> bubbles) {
        System.out.println("Set array of Bubbles in the water");
        this.bubbles = bubbles;
    }

    private void isOpened() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    degas();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    private void degas() throws InterruptedException {
        System.out.println("Releases batch of bubbles every second");
        for (int i = 0; i < bubbles.size(); i += 10 + 5 * getTemperature()) {
            for (int j = i; j <= i + 10 + 5 * getTemperature(); j++) {
                bubbles.get(j).cramp();
                bubbles.remove(j);
            }

            Thread.sleep(1000);
        }

    }

    public boolean isSparkle() {
        System.out.println("Return true if there are gas bubbles in the water");
        return bubbles.size() > 0;
    }

    public void setOpened(boolean isOpened) {
        System.out.println("Change state of the water to open");
        this.isOpened = isOpened;
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

    @Override
    public void mix() {

    }
}


