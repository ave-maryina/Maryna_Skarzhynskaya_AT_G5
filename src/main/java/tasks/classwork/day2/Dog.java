package tasks.classwork.day2;

import java.util.Random;

public class Dog {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;
        int e = 0;
        for(int i = 0; i < array.length; i++) {
            e = i;
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
            sum += array[i];
        }

        System.out.println("Average value is: " + (double)sum/array.length);


    }
}
