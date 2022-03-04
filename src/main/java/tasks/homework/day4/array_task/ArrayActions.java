package tasks.homework.day4.array_task;

import tasks.homework.day2.cycletask.ArrayCreating;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArrayActions {

    public void arraySum(int b) {

        int[] array = ArrayCreating.arrayCreating(10);
        int sum = 0;
        for (int i = b - 1; i < array.length; i += b) {
            sum += array[i];
        }

        System.out.println(sum);

    }

    public int[] getArray(int n) {

        int[] array = ArrayCreating.arrayCreating(10);
        int count = 0;
        for (int i : array) {
            if (i > n) {
                count++;
            }
        }

        int[] array1 = new int[count];
        int e = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                array1[e] = array[i];
                e++;
            }
        }
        return array1;

    }

    public int sum() {
        int[] array = ArrayCreating.arrayCreating(10);
        int sum = 0;
        Calendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        for (int i : array) {
            if (i % month == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void draw() {
        System.out.println("   ^__^");
        System.out.println("   (oo)\\_______");
        System.out.println("   (__)\\ ) \\/\\  \\");
        System.out.println("        ||----W |\\");
        System.out.println("        ||     ||");
    }
}


