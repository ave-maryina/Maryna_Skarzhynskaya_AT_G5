package tasks.homework.day2.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int i) {
        return i * 3;
    }

    public long returnNewLong(long l) {
        return l - 4;
    }

    public String returnNewChar(char ch) {

        return String.valueOf(ch + ch);
    }

    public float returnNewFloat(float f) {
        return f / 2;
    }

    public double returnNewDouble(double d) {
        return d + 8;
    }

    public short returnNewShort(short sh) {
        return (short)(sh - 1);
    }

    public byte returnNewByte(byte b) {
        return (byte) (b * 2);
    }

    public boolean returnNewBoolean(boolean b) {
        return !b;
    }

}
