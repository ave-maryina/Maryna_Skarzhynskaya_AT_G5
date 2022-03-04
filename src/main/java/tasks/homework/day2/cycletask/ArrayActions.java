package tasks.homework.day2.cycletask;

import java.util.Random;

public class ArrayActions {

    public void output(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void reverseOutput(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void arrayMultiplication(int[] array) {


        for (int i : array) {

            System.out.print(i * 5 + " ");
        }
        System.out.println();
    }

    public void arraySquaring(int[] array) {


        for (int i : array) {

            System.out.print(i * i + " ");
        }
        System.out.println();
    }

    public void findingMinElement(int[] array) {

        int min = 99999;
        for (int i : array) {

            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

    public void changingArrayElements(int[] array) {

        int firstEl = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = firstEl;

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void arraySorting(int[] array) {
  
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
