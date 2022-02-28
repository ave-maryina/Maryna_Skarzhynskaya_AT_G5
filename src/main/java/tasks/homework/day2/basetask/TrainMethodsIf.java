package tasks.homework.day2.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int i) {

        if (i < 8) {
            return i * 7;

        } else {
            return i / 4;
        }
    }

    public long returnNewLong (long i) {

        if (i > 300) {
            return i - 300;

        } else {
            return i + 20;
        }
    }

    public String returnNewChar (char i) {

        if (i == 103) {
            return "go";

        } else {
            return "o" + i;
        }
    }

    public float returnNewFloat(float i) {

        if (i == 0.67) {
            return i;

        } else {
            return i * 2;
        }
    }

    public double returnNewDouble(double i) {

        if (i > 30 && i < 80) {
            return i + 87;

        } else if (i > 80 && i < 400){
            return i - 87;
        } else if (i > 400) {
            return i / 4;
        } else
            return i;
    }

    public void returnNewBoolean(boolean b) {
        if (b) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
