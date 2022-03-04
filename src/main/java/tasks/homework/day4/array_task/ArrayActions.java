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

        public int[] getGraterThanN(int n, int[] array) {

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

        public int sum(int[] array) {
            int sum = 0;
            Calendar calendar = new GregorianCalendar();
            int month = calendar.get(Calendar.MONTH) + 1;
            for (int i : array) {
                if (i % month == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }
