package tasks.homework.day4.array_task;

import tasks.homework.day2.cycletask.ArrayCreating;

public class ArrayActionsRunner {

    public static void main(String[] args) {
        ArrayActions arrayActions = new ArrayActions();
        int[] array = ArrayCreating.createArray(10);
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arrayActions.arraySum(3, array));
    }
}

