package project.water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
        System.out.println("Call method isOpened()");
        isOpened();
    }

    public void  pump(Bubble[] bubbles) {
        System.out.println("Set array of Bubbles in the water");
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("carbon dioxide");
        }
        this.setBubbles(bubbles);
    }

    private void isOpened() {
        System.out.println("Check state of the water, if opened call method degas");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                if (isOpened) {
                    degas();
                }
            }
        });
        thread.start();
    }

    private void degas() {
        System.out.println("Releases batch of bubbles every second");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < bubbles.length; i += 10 + 5 * getTemperature()) {
                    for(int j = i; j <= i + 10 + 5 * getTemperature(); j++) {
                        bubbles[j].cramp();
                        bubbles[j] = null;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public boolean isSparkle() {
        System.out.println("Return true if there are gas bubbles in the water");
        for (Bubble bubble : bubbles) {
            if (!(bubble == null)) {
                return true;
            }
        }
        return false;
    }

    public void setOpened(boolean isOpened) {
        System.out.println("Change state of the water to open");
        this.isOpened = isOpened;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
}
