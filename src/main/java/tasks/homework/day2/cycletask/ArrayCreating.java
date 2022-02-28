package tasks.homework.day2.cycletask;

import java.util.Random;

public class ArrayCreating {

    public static int[] arrayCreating (int size) {

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }
}
