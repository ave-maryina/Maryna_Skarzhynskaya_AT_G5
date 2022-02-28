package project.water;

public class Bubble {

    public static final double VOLUME = 0.3;
    private String gasStructure;

    public void burst() {

        System.out.print("Cramp! ");
    }

    public Bubble(String gasStructure) {

        this.gasStructure = gasStructure;
    }

    public double getVolume() {
        return VOLUME;
    }

    public String getGasStructure() {
        return gasStructure;
    }

    public void setGasStructure(String gasStructure) {
        this.gasStructure = gasStructure;
    }
}
