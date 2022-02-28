package tasks.homework.day2.basetask;

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло " + this.severity + " препятствие " + this.description );
    }
}
