package tasks.homework.day2.cycletask;

import java.util.Random;

public class ArrayActions {

    public void output() {

        for (int i : ArrayCreating.createArray(7)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void reverseOutput() {

        int[] array = ArrayCreating.createArray(7);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void arrayMultiplication() {

        for (int i : ArrayCreating.createArray(7)) {
            System.out.print(i * 5 + " ");
        }
        System.out.println();
    }

    public void arraySquaring() {

        for (int i : ArrayCreating.createArray(7)) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    public void findingMinElement() {

        int min = 99999;
        for (int i : ArrayCreating.createArray(7)) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

    public void changingArrayElements() {

        int array[] = ArrayCreating.createArray(7);
        int firstEl = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstEl;

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void arraySorting() {
        int array[] = ArrayCreating.createArray(7);
        int smaller;
        boolean isSorter = false;
        while (!isSorter) {
            isSorter = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorter = false;
                    smaller = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = smaller;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
