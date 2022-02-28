package tasks.homework.day2.basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processSauce(new Sauce("горчичный", "горчичный"));
        trainMethodsObjects.processBee(new Bee("male", 9000) );
        trainMethodsObjects.processMouse(new Mouse("Masha", 20));
        trainMethodsObjects.processObstacle(new Obstacle("механическое", "средняя"));
        trainMethodsObjects.processPineapple(new Pineapple("медовый", 500));

    }
}
