package project.water;

public class SparklingWater extends Water {

    private Bubble[] bubbles;



    public void  pump() {

        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i] = new Bubble("");
        }

    }

    public void degas() {
        for (int i = 0; i < this.bubbles.length; i++) {
            bubbles[i].burst();
            bubbles[i] = null;
        }

    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
}
