package tasks.homework.day2.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        System.out.println("Метод returnNewChar вернул " + trainMethodsReturn.returnNewChar('%'));
        System.out.println("Метод returnNewInt вернул " + trainMethodsReturn.returnNewInt(4));
        System.out.println("Метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(9999999));
        System.out.println("Метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(3.5F));
        System.out.println("Метод returnNewByte вернул " + trainMethodsReturn.returnNewByte((byte) 4));
        System.out.println("Метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(46.6));
        System.out.println("Метод returnNewShort вернул " + trainMethodsReturn.returnNewShort((short) 55));
        System.out.println("Метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(true));

    }
}
