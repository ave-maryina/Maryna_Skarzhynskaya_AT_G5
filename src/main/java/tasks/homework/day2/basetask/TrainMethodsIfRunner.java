package tasks.homework.day2.basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        System.out.println("Метод returnNewChar вернул " + trainMethodsIf.returnNewChar('g'));
        System.out.println("Метод returnNewInt вернул " + trainMethodsIf.returnNewInt(90));
        System.out.println("Метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(100.34));
        System.out.println("Метод returnNewLong вернул " + trainMethodsIf.returnNewLong(500));
        System.out.println("Метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat((float) 3.9));
        trainMethodsIf.returnNewBoolean(false);

    }
}
