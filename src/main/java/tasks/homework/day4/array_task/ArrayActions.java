package tasks.homework.day4.array_task;
import tasks.homework.day2.cycletask.ArrayCreating;

import tasks.homework.day2.cycletask.ArrayCreating;
import java.util.Calendar;
import java.util.GregorianCalendar;

    public class ArrayActions {

        public int arraySum(int n, int[] array) {

            int sum = 0;
            for (int i = n - 1; i < array.length; i += n) {
                sum += array[i];
            }
            return sum;
        }
}
